package com.example.demohello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class helloword {

    @GetMapping ("/login")
    public String hello() {
        System.out.println("hello");
            return "main";
    }
   
   

      
            
        
    }

