package com.kyobo.service.impl;

import com.kyobo.dao.NewMember;
import com.kyobo.dto.NewMemberVO;
import com.kyobo.service.NewMemberService;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class NewMemberImpl implements NewMemberService {


    private final NewMember newMember;

    public NewMemberImpl(NewMember newMember){
        this.newMember = newMember;
    }

    @Override
    public int newMember(NewMemberVO newMemberVO) {
        return newMember.newMember(newMemberVO);
    }
}
