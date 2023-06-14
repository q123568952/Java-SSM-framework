package com.morgan.springIoCandDIdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @RequestMapping("/toJumpPage")
    @ResponseBody
    public String toJumpPage(){
        System.out.println("跳頁面囉");
        return "page.jsp";
    }

}
