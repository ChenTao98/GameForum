package com.software.gameforum.controller;

import com.software.gameforum.entity.Posts;
import com.software.gameforum.entity.User;
import com.software.gameforum.jsonBean.PostBean;
import com.software.gameforum.service.PostService;
import com.software.gameforum.utils.GameForumJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping(value = "{postid}", produces = "application/json;charset=UTF-8")
    public String getPost(@PathVariable() int postid, HttpServletRequest request) {
        Posts posts = postService.getPostByPostid(postid);
        GameForumJSON gameForumJSON = new GameForumJSON();
        gameForumJSON.setSuccessCode();
        if (posts != null) {
            PostBean postBean = new PostBean(posts);
            gameForumJSON.put("data", postBean);
            User user = getUserByRequest(request);
            if (user != null) {
                if (postService.getFollowByPostIdAndUserId(postid, user.getId()) != null) {
                    postBean.setFollowStatus(1);
                }
                if (postService.getPraiseByPostIdAndUserId(postid, user.getId()) != null) {
                    postBean.setPraiseStatus(1);
                }
            }
        } else {
            gameForumJSON.put("data", null);
        }
        return gameForumJSON.toMyString(true);
    }

    private User getUserByRequest(HttpServletRequest request) {
        Object object = request.getSession().getAttribute("user");
        return object instanceof User ? (User) object : null;
    }
}
