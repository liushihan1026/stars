package com.it.dao;


import com.it.model.UserVO;

import java.util.List;

public interface IUserDao {

	List<UserVO> selectAllUsers();

}
