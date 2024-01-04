package com.kyobo.controller;

import com.kyobo.dao.NewMember;
import com.kyobo.dto.NewMemberVO;
import com.kyobo.service.NewMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewMemberController {

    private final NewMemberService newMemberService;

    public NewMemberController(NewMemberService newMemberService) {
        this.newMemberService = newMemberService;
    }

    @GetMapping("/newMember")
    public String newMember(){

        NewMemberVO newMemberVO = new NewMemberVO();
        newMemberVO.setManage_no("05");
        newMemberVO.setLogin_id("test1");
        newMemberVO.setLogin_pw("1");
        int result = newMemberService.newMember(newMemberVO);

        return "/test";
    }

}
