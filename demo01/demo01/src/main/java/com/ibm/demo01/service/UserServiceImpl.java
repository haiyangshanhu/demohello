package com.ibm.demo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.demo01.dao.UserDao;
import com.ibm.demo01.entity.User;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String simpleUser(User user) {
        
        System.out.println("hello,UserServiceImpl");
        return userDao.stringUser(user);
    }

}
