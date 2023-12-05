package com.kyobo.dao;

import com.kyobo.dto.UserVO;
import jdk.jfr.Registered;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<UserVO> getUserList();
}
