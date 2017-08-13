package com.it.service.impl;

import com.it.dao.IUserDao;
import com.it.model.UserVO;
import com.it.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService{

    @Autowired
    private IUserDao userDao;

    @Override
    public List<UserVO> findUsers() {
        return userDao.selectAllUsers();
    }
}
