package com.kyobo.controller;

import com.kyobo.dto.UserVO;
import com.kyobo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class CommonController {
    private final UserService userService;

    public CommonController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/test")
    public String hello() {
        return "test";
    }

    @GetMapping("/user")
    public ModelAndView getUserList() {
        ModelAndView mav = new ModelAndView();
        List<UserVO> resultList = userService.getUserList();

        mav.addObject("result", resultList);
        mav.addObject("result_0_name", resultList.get(0).getName());

        mav.setViewName("/test");

        return mav;
    }
}
