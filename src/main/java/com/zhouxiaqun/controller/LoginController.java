package com.zhouxiaqun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String username, String password){
        if (username.equals("admin") && password.equals("admin")){
            return "success";
        }
        return "error";
    }
}
