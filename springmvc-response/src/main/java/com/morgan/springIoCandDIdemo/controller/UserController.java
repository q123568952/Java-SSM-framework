package com.morgan.springIoCandDIdemo.controller;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("888");
        user1.setAge(80);
        users.add(user1);
        User user2 = new User();
        user2.setName("777");
        user2.setAge(90);
        users.add(user2);
        System.out.println("返回Json list數據");
        return users;
    }
}
