package com.software.gameforum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {
    @RequestMapping({"index","","login"})
    public String init(){
        return "you need login";
    }
}
