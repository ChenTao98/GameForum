package com.software.gameforum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TestController {
    @RequestMapping({"index", "", "login"})
    public String init() {
        return "login";
    }

    @RequestMapping("test")
    public String test() {
        return "test";
    }
}
