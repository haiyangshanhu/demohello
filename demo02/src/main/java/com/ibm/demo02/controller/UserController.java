package com.ibm.demo02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo02.pojo.User;
import com.ibm.demo02.service.UserService;

@RestController
public class UserController {
    // @Autowired
	// private UserMapper userMapper;
    
    // @RequestMapping("/hello")
    // public String simpleUser(){
    //     List<User> userList = userMapper.list();
	//     userList.stream().forEach(user ->{
	// 	System.out.println(user);
	//   });
    // return "hello";
    // }

    // @RequestMapping("/submit-login")
    // public void insertUser(User user){
    //     System.out.println("insert user" + user.getPassword()+user.getUsername());
    //     userMapper.add(user);
    // }

    @Autowired
    private UserService userService;

    @RequestMapping("/submit-add")
    public void add(User user){
        userService.add(user);
    }

    @RequestMapping("/select")
    public List<User> selectAll(){
        userService.selectAll().stream().forEach(user ->{
            System.out.println(user);
            
          });
          return userService.selectAll();
    }

}
