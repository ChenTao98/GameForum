package com.software.gameforum.controller;

import com.alibaba.fastjson.JSONObject;
import com.software.gameforum.entity.User;
import com.software.gameforum.interceptor.UserLoginInterceptor;
import com.software.gameforum.service.UserService;
import com.software.gameforum.utils.GameForumJSON;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/")
public class RegisterController {
    @Autowired
    private UserService userService;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserLoginInterceptor.class);
    private static final String errorCodeStr = "errorCode";
    private static final String messageStr = "message";

    @PostMapping(value = "register", produces = "application/json;charset=UTF-8")
    public String register(@RequestBody JSONObject jsonObject, HttpServletRequest request) {
        User user = new User(jsonObject.getString("username"), jsonObject.getString("phonenum"), jsonObject.getString("email"), jsonObject.getString("password"));
        int result = userService.register(user);
        GameForumJSON gameForumJSON = new GameForumJSON();
        if (result == -1) {
            gameForumJSON.setErrorCode(1, "电话号码或者邮箱已存在");
        } else if (result == 1) {
            gameForumJSON.setSuccessCode();
            setSession(request, user);
        }
        return gameForumJSON.toMyString(true);
    }

    @PostMapping(value = "login", produces = "application/json;charset=UTF-8")
    public String login(@RequestBody JSONObject jsonObject, HttpServletRequest request) {
        GameForumJSON gameForumJSON = new GameForumJSON();
        User user = userService.login(jsonObject.getString("username"), jsonObject.getString("password"));
        if (user == null) {
            gameForumJSON.setErrorCode(1, "邮箱或者密码错误");
        } else {
            gameForumJSON.setSuccessCode();
            setSession(request, user);
        }
        return gameForumJSON.toMyString(true);
    }

    //如果更改了session的存储信息多少，请务必更新UserController的updateSession
    private void setSession(HttpServletRequest request, User user) {
        User userSession = new User();
        userSession.setId(user.getId());
        userSession.setEmail(user.getEmail());
        userSession.setHeadpic(user.getHeadpic());
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("user", userSession);
    }
}
