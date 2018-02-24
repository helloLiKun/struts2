package com.struts.cn.entity;

import java.io.Serializable;

/**
 * Created by likun on 2018/2/24 0024.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -2074369796447083139L;
    private String name;
    private String pwd;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", pwd=" + pwd + "]";
    }
}

