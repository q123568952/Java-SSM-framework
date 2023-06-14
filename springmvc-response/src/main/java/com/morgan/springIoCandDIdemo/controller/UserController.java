package com.morgan.springIoCandDIdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
}
