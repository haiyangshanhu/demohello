package com.ibm.demo02.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.demo02.mapper.UserMapper;
import com.ibm.demo02.pojo.User;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
	private UserMapper userMapper;

    @Override
    public List<User> selectAll() {

        userMapper.list().stream().forEach(userRecord ->{
            System.out.println(userRecord);      
          });
          return userMapper.list();
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
        user.setPassword(user.getPassword());
        user.setUsername(user.getUsername());
        System.out.println("hello user!!!"+user.getUsername()+user.getPassword());
    }

}
