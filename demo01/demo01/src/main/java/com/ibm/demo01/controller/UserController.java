package com.ibm.demo01.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo01.entity.User;
import com.ibm.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
 public class UserController {
    
    @Autowired
    private UserService userService;

   //  @RequestMapping("/submit-login")
   //  public String simpleUser(){   

   //     System.out.println("hello,controller");
   //     return userService.simpleUser();  
   //  }

    @RequestMapping("/submit-login")
    public String simpleUser(User user){
      return userService.simpleUser(user);
    
    }



}
