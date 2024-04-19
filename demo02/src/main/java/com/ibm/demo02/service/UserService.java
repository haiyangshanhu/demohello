package com.ibm.demo02.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo02.pojo.User;

@Service
public interface UserService {

    public List<User> selectAll();

    public void add(User user);
    
}
