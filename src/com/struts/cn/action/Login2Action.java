package com.struts.cn.action;

import com.struts.cn.entity.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by likun on 2018/2/24 0024.
 */
public class Login2Action implements SessionAware {
    private User user;
    private String message;
    private Map<String,Object> session;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Map<String, Object> getSession() {
        return session;
    }
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String execute(){
        if(user.getName().equals("Robin")
                && user.getPwd().equals("123")){
            session.put("loginName", "Robin");
            return "success";
        }
        message="用户名或密码错误，请重新登录！";
        return "error";
    }
}
