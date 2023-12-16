package com.kyobo.dto;

import lombok.Data;

@Data
public class UserVO {

    private String manage_no;
    private String login_id;
    private String login_pw;
    private String name;
    private String address;
    private String phone;
}
