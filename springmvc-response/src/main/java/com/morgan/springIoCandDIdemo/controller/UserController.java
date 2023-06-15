package com.morgan.springIoCandDIdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.morgan.springIoCandDIdemo.domain.User;


@Controller
public class UserController {

    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳頁面囉");
        return "page.jsp";
    }
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回文本數據");
        return "response text";
    }
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        User user = new User();
        user.setName("888");
        user.setAge(80);
        System.out.println("返回Json數據");
        return user;
    }
}
