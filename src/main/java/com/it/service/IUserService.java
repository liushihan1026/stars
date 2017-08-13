package com.it.service;

import com.it.model.UserVO;

import java.util.List;

/**
 * Created by Jeremy on 2017/8/13.
 */
public interface IUserService {

    public List<UserVO> findUsers();
}
