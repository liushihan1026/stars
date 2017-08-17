package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManController {

    @GetMapping("/")
    public String index(){
        return "/index";
    }

    @GetMapping("/login")
    public String login(){
        return "/admin/login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "/admin/login";
    }

}
