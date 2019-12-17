package com.software.gameforum.controller;

import com.alibaba.fastjson.JSONObject;
import com.software.gameforum.entity.Games;
import com.software.gameforum.entity.Posts;
import com.software.gameforum.entity.User;
import com.software.gameforum.entity.Userfollowgames;
import com.software.gameforum.interceptor.UserLoginInterceptor;
import com.software.gameforum.jsonBean.GameBean;
import com.software.gameforum.jsonBean.PostBean;
import com.software.gameforum.jsonBean.UserBean;
import com.software.gameforum.service.GameService;
import com.software.gameforum.service.PostService;
import com.software.gameforum.service.UserService;
import com.software.gameforum.utils.GameForumJSON;
import com.software.gameforum.utils.PathUtils;
import com.software.gameforum.utils.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserLoginInterceptor.class);
    @Autowired
    private UserService userService;
    @Autowired
    private GameService gameService;
    @Autowired
    private PostService postService;

    @RequestMapping("/index")
    public String index() {
        return "user login success";
    }

    @PostMapping(value = "modifyInfo", produces = "application/json;charset=UTF-8")
    public String modifyInfo(@RequestParam(required = false) MultipartFile headpic,
                             @RequestParam(required = false) String username,
                             @RequestParam(required = false) String phonenum,
                             @RequestParam(required = false) String email, HttpServletRequest httpServletRequest) throws IOException {
        GameForumJSON gameForumJSON = new GameForumJSON();
        if (StringUtils.isEmpty(username) && StringUtils.isEmpty(phonenum) && StringUtils.isEmpty(email) && (headpic == null || headpic.isEmpty())) {
            gameForumJSON.setErrorCode(3, "至少修改一样信息");
            return gameForumJSON.toMyString(true);
        }
        User user = new User();
        user.setId(getUserByRequest(httpServletRequest).getId());
        String oldImageName = null;
        String newImageName = null;
        if (!StringUtils.isEmpty(username)) {
            user.setUsername(username);
        }
        if (!StringUtils.isEmpty(phonenum)) {
            user.setPhonenum(phonenum);
        }
        if (!StringUtils.isEmpty(email)) {
            user.setEmail(email);
            LOGGER.debug(getUserByRequest(httpServletRequest).getEmail());
        }
        if (headpic != null && !headpic.isEmpty()) {
            String fileName = headpic.getOriginalFilename();
            newImageName = UUID.randomUUID().toString().replaceAll("-", "") + fileName.substring(fileName.lastIndexOf("."));
            headpic.transferTo(new File(PathUtils.USER_HEAD_PIC_PATH + newImageName));
            oldImageName = getUserByRequest(httpServletRequest).getHeadpic();
            LOGGER.debug(oldImageName);
            LOGGER.debug(newImageName);
            user.setHeadpic(newImageName);
        }
        int result = userService.modifyInfo(user);
        if (result == -1) {
            gameForumJSON.setErrorCode(1, "邮箱或者电话号码已存在");
            removeImage(newImageName);
        } else if (result != 1) {
            gameForumJSON.setErrorCode(2, "系统内部错误");
            removeImage(newImageName);
        } else {
            gameForumJSON.setSuccessCode();
            removeImage(oldImageName);
            updateSession(httpServletRequest, user);
        }
        return gameForumJSON.toMyString(true);
    }

    private User getUserByRequest(HttpServletRequest httpServletRequest) {
        return (User) httpServletRequest.getSession().getAttribute("user");
    }

    @GetMapping(value = "mine", produces = "application/json;charset=UTF-8")
    public String mine(HttpServletRequest request) {
        int id = getUserByRequest(request).getId();
        User user = userService.getUserById(id);
        UserBean userBean = new UserBean(user);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", userBean);
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "other/{userid}", produces = "application/json;charset=UTF-8")
    public String otherUser(HttpServletRequest request, @PathVariable() int userid) {
        User user = userService.getUserById(userid);
        GameForumJSON gameForumJSON = new GameForumJSON();
        UserBean userBean = null;
        if (user != null) {
            userBean = new UserBean(user);
            gameForumJSON.setSuccessCode();
        } else {
            gameForumJSON.setErrorCode(1, "没有该用户");
        }
        gameForumJSON.put("data", userBean);
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "gamesPlayed", produces = "application/json;charset=UTF-8")
    public String gamesPlayed(HttpServletRequest request) {
        int userid = getUserByRequest(request).getId();
        List<Games> gamesList = gameService.userPlayed(userid);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", gamesListToBeanList(gamesList));
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "gamesFollowed", produces = "application/json;charset=UTF-8")
    public String gamesFollow(HttpServletRequest request) {
        int userid = getUserByRequest(request).getId();
        List<Games> gamesList = gameService.userFollow(userid);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", gamesListToBeanList(gamesList));
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "addGamePlayed", produces = "application/json;charset=UTF-8")
    public String addGamePlayed(HttpServletRequest request, @RequestBody() JSONObject jsonObject) {
        GameForumJSON gameForumJSON = new GameForumJSON();
        int userid = getUserByRequest(request).getId();
        int result = gameService.addGamePlayed(userid, jsonObject.getInteger("gameid"));
        if (result == 1) {
            gameForumJSON.setSuccessCode();
        } else {
            gameForumJSON.setErrorCode(1, "数据库出错");
        }
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "followGame", produces = "application/json;charset=UTF-8")
    public String followGame(HttpServletRequest request, @RequestBody() JSONObject jsonObject) {
        int userId = getUserByRequest(request).getId();
        int gameId = jsonObject.getInteger("gameid");
        Userfollowgames userfollowgames = new Userfollowgames();
        userfollowgames.setGameid(gameId);
        userfollowgames.setUserid(userId);
        GameForumJSON gameForumJSON = new GameForumJSON();
        if (userService.userFollowGame(userfollowgames) == 1) {
            gameForumJSON.setSuccessCode();
        } else {
            gameForumJSON.setErrorCode(1, "数据库出错，插入失败");
        }
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "post", produces = "application/json;charset=UTF-8")
    public String post(HttpServletRequest request, @RequestBody() JSONObject jsonObject) {
        Posts posts = new Posts();
        posts.setGameid(jsonObject.getInteger("gameid"));
        posts.setUserid(getUserByRequest(request).getId());
        posts.setTopic(jsonObject.getString("topic"));
        posts.setContent(jsonObject.getString("content"));
        posts.setUrl("need to be replace");
        posts.setTime(new Date());
        GameForumJSON gameForumJSON = new GameForumJSON();
        if (postService.addPost(posts) == 1) {
            gameForumJSON.setSuccessCode();
        } else {
            gameForumJSON.setErrorCode(1, "数据库出错");
        }
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "postsPublished", produces = "application/json;charset=UTF-8")
    public String postsPublished(HttpServletRequest request) {
        int userId = getUserByRequest(request).getId();
        List<Posts> postsList = postService.getUserPublishedPosts(userId);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", postsListToBeanList(postsList, request));
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "postsFollowed", produces = "application/json;charset=UTF-8")
    public String postsFollowed(HttpServletRequest request) {
        int userId = getUserByRequest(request).getId();
        List<Posts> postsList = postService.getUserFollowPosts(userId);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", postsListToBeanList(postsList, request));
        return gameForumJSON.toMyString(true);
    }
    //TODO 我发布的消息接口未完成,我评论的帖子接口未完成


    private List<GameBean> gamesListToBeanList(List<Games> list) {
        List<GameBean> gameBeanList = new ArrayList<>();
        for (Games game : list) {
            gameBeanList.add(new GameBean(game));
        }
        return gameBeanList;
    }

    private List<PostBean> postsListToBeanList(List<Posts> list, HttpServletRequest request) {
        List<PostBean> postBeanList = new ArrayList<>();
        Map<Integer, PostBean> map = new HashMap<>();
        for (Posts post : list) {
            PostBean postBean = new PostBean(post);
            postBeanList.add(postBean);
            map.put(postBean.getPostid(), postBean);
        }
        updateStatus(map, request);
        return postBeanList;
    }

    private void updateStatus(Map<Integer, PostBean> map, HttpServletRequest request) {
        if (map == null || map.size() == 0) {
            return;
        }
        User user = getUserByRequest(request);
        List<Posts> postsFollow = postService.getUserFollowPosts(user.getId());
        List<Posts> postsPraise = postService.getUserPraisePosts(user.getId());
        for (Posts post : postsFollow) {
            if (map.containsKey(post.getId())) {
                map.get(post.getId()).setFollowStatus(1);
            }
        }
        for (Posts post : postsPraise) {
            if (map.containsKey(post.getId())) {
                map.get(post.getId()).setPraiseStatus(1);
            }
        }
    }

    private void removeImage(String imageName) {
        if (imageName != null && !imageName.equals(PathUtils.DEFAULT_IMAGE_NAME)) {
            File file = new File(PathUtils.USER_HEAD_PIC_PATH + imageName);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    //如果更改了session的存储信息多少，请务必更新register的setSession
    private void updateSession(HttpServletRequest request, User user) {
        User curUser = (User) request.getSession().getAttribute("user");
        if (user.getEmail() != null) {
            curUser.setEmail(user.getEmail());
        }
        if (user.getHeadpic() != null) {
            curUser.setHeadpic(user.getHeadpic());
        }
    }

}
