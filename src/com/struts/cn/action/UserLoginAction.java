package com.struts.cn.action;

import com.struts.cn.entity.User;

/**
 * Created by likun on 2018/2/24 0024.
 */
public class UserLoginAction {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String execute(){
        System.out.println(user);
        return "fail";
    }
}
