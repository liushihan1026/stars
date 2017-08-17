package com.it.service.impl;

import com.it.dao.IUserDao;
import com.it.model.UserVO;
import com.it.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("service/users")
public class UserService implements IUserService{

    @Autowired
    private IUserDao userDao;


    @ApiOperation(value = "findAllUsers")
    @GetMapping("/findAllUsers")
    @Override
    public List<UserVO> findUsers() {
        return userDao.selectAllUsers();
    }
}
