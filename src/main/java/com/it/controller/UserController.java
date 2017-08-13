package com.it.controller;

import com.it.model.UserVO;
import com.it.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/findAllUsers")
    List<UserVO> findAllUsers(){
        return userService.findUsers();
    }
}
