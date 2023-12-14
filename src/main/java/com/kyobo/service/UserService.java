package com.kyobo.service;

import com.kyobo.dto.UserVO;

import java.util.List;

public interface UserService {

    public List<UserVO> getUserList();

    public UserVO getUserById(String login_id);
}
