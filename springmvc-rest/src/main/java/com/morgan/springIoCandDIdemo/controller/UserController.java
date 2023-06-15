package com.morgan.springIoCandDIdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.morgan.springIoCandDIdemo.domain.User;

@Controller

public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable int id){
        System.out.println("user delete ..."+ id);
        return "{'module':'user delete'}";
    }
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update ... " + user);
        return "{'module':'user update'}";
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable int id){
        System.out.println("user getById ..."+ id);
        return "{'module':'user getById'}";
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String findAll(){
        System.out.println("user findAll ...");
        return "{'module':'user findAll'}";
    }
}
