package com.kyobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {


    @GetMapping("test")
    public String hello() {
        return "test";
    }
}
