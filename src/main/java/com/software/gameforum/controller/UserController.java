package com.software.gameforum.controller;

import com.software.gameforum.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @RequestMapping("/index")
    public String index() {
        return "user login success";
    }

    private User getUserByRequest(HttpServletRequest httpServletRequest) {
        return (User) httpServletRequest.getSession().getAttribute("user");
    }
}
