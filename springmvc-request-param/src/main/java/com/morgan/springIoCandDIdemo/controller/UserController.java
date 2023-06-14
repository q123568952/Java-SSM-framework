package com.morgan.springIoCandDIdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.morgan.springIoCandDIdemo.domain.User;

@Controller
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age){
        System.out.println("普通參數傳遞"+ name + "-----"+age);
        return "{'module':'common Param'}";
    }

     @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName, int age){
        System.out.println("普通參數傳遞"+ userName + "-----"+age);
        return "{'module':'common Param different name'}";
    }

     @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("普通參數傳遞"+ user );
        return "{'module':'pojo Contain Pojo Param'}";
    }

     @RequestMapping("/PojoParam")
    @ResponseBody
    public String PojoParam(User user){
        System.out.println("普通參數傳遞"+ user );
        return "{'module':'Pojo Param'}";
    }

     @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("普通參數傳遞"+ Arrays.toString(likes) );
        return "{'module':'array Param'}";
    }

     @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("普通參數傳遞"+ likes );
        return "{'module':'list Param'}";
    }
}
