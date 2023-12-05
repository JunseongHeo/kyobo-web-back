package com.kyobo.dto;

import lombok.Data;

@Data
public class UserVO {

    private String manage_no;
    private String login_id;
    private String login_pw;
    private String name;

    public String getManage_no() {
        return manage_no;
    }

    public void setManage_no(String manage_no) {
        this.manage_no = manage_no;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getLogin_pw() {
        return login_pw;
    }

    public void setLogin_pw(String login_pw) {
        this.login_pw = login_pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String address;
    private String phone;
}
