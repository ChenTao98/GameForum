package com.software.gameforum.controller;

import com.alibaba.fastjson.JSONObject;
import com.software.gameforum.entity.*;
import com.software.gameforum.jsonBean.GameBean;
import com.software.gameforum.jsonBean.MessageBean;
import com.software.gameforum.jsonBean.PostBean;
import com.software.gameforum.jsonBean.ReplyBean;
import com.software.gameforum.service.GameService;
import com.software.gameforum.service.PostService;
import com.software.gameforum.utils.GameForumJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@RequestMapping("/api/game")
public class GameController {
    @Autowired
    private GameService gamesService;
    @Autowired
    private PostService postService;

    @GetMapping(value = "gameAndPosts", produces = "application/json;charset=UTF-8")
    public String gameAndPosts(HttpServletRequest request,
                               @RequestParam(required = false, defaultValue = "2") Integer n, @RequestParam() Integer step) {
        GameForumJSON gameForumJSON = new GameForumJSON();
        List<Games> gamesList = gamesService.gameAndPosts(step);
        Map<Integer, PostBean> map = null;
        User user = getUserByRequest(request);
        if (user != null) {
            map = new HashMap<>();
        }
        List<GameBean> gameBeanList = gamesListToBeanList(gamesList, map, n);
        updateStatus(map, user);
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", gameBeanList);
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "gameInfo/{gameid}", produces = "application/json;charset=UTF-8")
    public String gameInfo(@PathVariable() int gameid) {
        Games games = gamesService.getGameByGameId(gameid);
        GameBean gameBean = (games == null) ? null : new GameBean(games);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", gameBean);
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "gameRelatedPosts/{gameid}", produces = "application/json;charset=UTF-8")
    public String gameRelatedPost(@PathVariable() int gameid, @RequestParam(required = false, defaultValue = "3") int step,
                                  HttpServletRequest request) {
        List<Posts> postsList = postService.getPostByGameId(gameid, step);
        User user = getUserByRequest(request);
        List<PostBean> postBeanList = postsListToBeanList(postsList, user);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", postBeanList);
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "postRelatedMsg/{postid}", produces = "application/json;charset=UTF-8")
    public String postRelatedMsg(@PathVariable() int postid, HttpServletRequest request) {
        List<Message> list = postService.getMessageByPostId(postid);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", messageListToBeanList(list));
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "msgSeries/{msgid}", produces = "application/json;charset=UTF-8")
    public String msgSeries(@PathVariable() int msgid, HttpServletRequest request) {
        List<Reply> list = postService.getReplyByMessageId(msgid);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", replyListToBeanList(list));
        return gameForumJSON.toMyString(true);
    }

    @GetMapping(value = "hotGames", produces = "application/json;charset=UTF-8")
    public String hotGames(HttpServletRequest request,
                           @RequestParam(required = false, defaultValue = "3") Integer n) {
        GameForumJSON gameForumJSON = new GameForumJSON();
        List<Games> gamesList = gamesService.hotGames(n);
        Map<Integer, PostBean> map = null;
        User user = getUserByRequest(request);
        if (user != null) {
            map = new HashMap<>();
        }
        List<GameBean> gameBeanList = gamesListToBeanList(gamesList, map, null);
        updateStatus(map, user);
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", gameBeanList);
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "searchPost", produces = "application/json;charset=UTF-8")
    public String searchPost(@RequestBody() JSONObject jsonObject, HttpServletRequest request) {
        String searchKey = jsonObject.getString("searchKey");
        List<Posts> list = postService.searchPost(searchKey);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        gameForumJSON.put("data", postsListToBeanList(list, getUserByRequest(request)));
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "commentPost", produces = "application/json;charset=UTF-8")
    public String commentPost(@RequestBody() JSONObject jsonObject, HttpServletRequest request) {
        int postid = jsonObject.getInteger("postid");
        String content = jsonObject.getString("messageContent");
        Message message = new Message();
        message.setPostid(postid);
        message.setUserid(getUserByRequest(request).getId());
        message.setMessagecontent(content);
        message.setTime(new Date());
        postService.commentPost(message);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "replyMessage", produces = "application/json;charset=UTF-8")
    public String replyMessage(@RequestBody() JSONObject jsonObject, HttpServletRequest request) {
        int messageId = jsonObject.getInteger("messageid");
        String content = jsonObject.getString("messageContent");
        Reply reply = new Reply();
        reply.setMessageid(messageId);
        reply.setUserid(getUserByRequest(request).getId());
        reply.setReplycontent(content);
        reply.setTime(new Date());
        postService.replyMessage(reply);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "praisePost", produces = "application/json;charset=UTF-8")
    public String praisePost(@RequestBody() JSONObject jsonObject, HttpServletRequest request) {
        int postid = jsonObject.getInteger("postid");
        int userid = getUserByRequest(request).getId();
        GameForumJSON gameForumJSON = new GameForumJSON();
        int result = postService.praisePost(postid, userid);
        if (result == -1) {
            gameForumJSON.setErrorCode(1, "该帖子已点赞");
        } else {
            gameForumJSON.setSuccessCode();
        }
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "cancelPraisePost", produces = "application/json;charset=UTF-8")
    public String cancelPraisePost(@RequestBody() JSONObject jsonObject, HttpServletRequest request) {
        int postid = jsonObject.getInteger("postid");
        int userid = getUserByRequest(request).getId();
        GameForumJSON gameForumJSON = new GameForumJSON();
        int result = postService.cancelPraisePost(postid, userid);
        if (result == -1) {
            gameForumJSON.setErrorCode(1, "该帖子还未点赞");
        } else {
            gameForumJSON.setSuccessCode();
        }
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "followPost", produces = "application/json;charset=UTF-8")
    public String followPost(@RequestBody() JSONObject jsonObject, HttpServletRequest request) {
        int postid = jsonObject.getInteger("postid");
        int userid = getUserByRequest(request).getId();
        GameForumJSON gameForumJSON = new GameForumJSON();
        int result = postService.followPost(postid, userid);
        if (result == -1) {
            gameForumJSON.setErrorCode(1, "该帖子已收藏");
        } else {
            gameForumJSON.setSuccessCode();
        }
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "cancelFollowPost", produces = "application/json;charset=UTF-8")
    public String cancelFollowPost(@RequestBody() JSONObject jsonObject, HttpServletRequest request) {
        int postid = jsonObject.getInteger("postid");
        int userid = getUserByRequest(request).getId();
        GameForumJSON gameForumJSON = new GameForumJSON();
        int result = postService.cancelFollowPost(postid, userid);
        if (result == -1) {
            gameForumJSON.setErrorCode(1, "该帖子还未收藏");
        } else {
            gameForumJSON.setSuccessCode();
        }
        return gameForumJSON.toMyString(true);
    }

    private List<GameBean> gamesListToBeanList(List<Games> list, Map<Integer, PostBean> map, Integer nPost) {
        List<GameBean> gameBeanList = new ArrayList<>();
        for (Games game : list) {
            gameBeanList.add(new GameBean(game, map, nPost));
        }
        return gameBeanList;
    }

    private List<PostBean> postsListToBeanList(List<Posts> list, User user) {
        List<PostBean> postBeanList = new ArrayList<>();
        Map<Integer, PostBean> map = new HashMap<>();
        for (Posts post : list) {
            PostBean postBean = new PostBean(post);
            postBeanList.add(postBean);
            map.put(postBean.getPostid(), postBean);
        }
        updateStatus(map, user);
        return postBeanList;
    }

    private List<MessageBean> messageListToBeanList(List<Message> list) {
        List<MessageBean> beanList = new ArrayList<>();
        for (Message message : list) {
            beanList.add(new MessageBean(message));
        }
        return beanList;
    }

    private List<ReplyBean> replyListToBeanList(List<Reply> list) {
        List<ReplyBean> beanList = new ArrayList<>();
        for (Reply reply : list) {
            beanList.add(new ReplyBean(reply));
        }
        return beanList;
    }

    private void updateStatus(Map<Integer, PostBean> map, User user) {
        if (map == null || map.size() == 0 || user == null) {
            return;
        }
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

    private User getUserByRequest(HttpServletRequest request) {
        Object object = request.getSession().getAttribute("user");
        return object instanceof User ? (User) object : null;
    }
}
