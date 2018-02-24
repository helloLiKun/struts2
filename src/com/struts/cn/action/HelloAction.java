package com.struts.cn.action;


/**
 * Created by likun on 2018/2/24 0024.
 */
public class HelloAction {
    /*
	 * 方法名必须为execute()
	 */
    private String message;

    public String getMessage() {
        return message;
    }

    public String execute(){
        message="HI......";
        System.out.println("Hello Word!!!");
        return "fail";
    }
}
