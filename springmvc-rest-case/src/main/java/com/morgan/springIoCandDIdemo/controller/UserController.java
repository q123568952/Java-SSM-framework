package com.morgan.springIoCandDIdemo.controller;

import java.util.ArrayList;
import java.util.List;

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

    @PostMapping
    public String save (@RequestBody User user){
        System.out.println("user save ..."+user);
        return "{'module':'user save success'}";
    }

    @GetMapping
    public List<User> getAll(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("aaa");
        user1.setAge(50);
        User user2 = new User();
        user2.setName("bbb");
        user2.setAge(60);
        users.add(user1);
        users.add(user2);
        return users;
    }

    // // @RequestMapping(method = RequestMethod.POST)
    // @PostMapping
    // public String save(){
    //     System.out.println("user save ...");
    //     return "{'module':'user save'}";
    // }
    // // @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    // @DeleteMapping("/{id}")
    // public String delete(@PathVariable int id){
    //     System.out.println("user delete ..."+ id);
    //     return "{'module':'user delete'}";
    // }
    // // @RequestMapping(method = RequestMethod.PUT)
    // @PutMapping
    // public String update(@RequestBody User user){
    //     System.out.println("user update ... " + user);
    //     return "{'module':'user update'}";
    // }
    // // @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // @GetMapping("/{id}")
    // public String getById(@PathVariable int id){
    //     System.out.println("user getById ..."+ id);
    //     return "{'module':'user getById'}";
    // }
    // // @RequestMapping(method = RequestMethod.GET)
    // @GetMapping
    // public String findAll(){
    //     System.out.println("user findAll ...");
    //     return "{'module':'user findAll'}";
    // }
}
