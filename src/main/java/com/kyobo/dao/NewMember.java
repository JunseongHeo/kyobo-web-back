package com.kyobo.dao;

import com.kyobo.dto.NewMemberVO;
import com.kyobo.dto.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NewMember {

    int newMember(NewMemberVO newMemberVO);



}
