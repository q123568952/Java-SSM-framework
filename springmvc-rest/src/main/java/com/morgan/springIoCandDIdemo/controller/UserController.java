package com.morgan.springIoCandDIdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.morgan.springIoCandDIdemo.domain.User;

// @Controller
// @ResponseBody
@RestController
@RequestMapping("/users")
public class UserController {

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }
    // @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        System.out.println("user delete ..."+ id);
        return "{'module':'user delete'}";
    }
    // @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("user update ... " + user);
        return "{'module':'user update'}";
    }
    // @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable int id){
        System.out.println("user getById ..."+ id);
        return "{'module':'user getById'}";
    }
    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String findAll(){
        System.out.println("user findAll ...");
        return "{'module':'user findAll'}";
    }
}
