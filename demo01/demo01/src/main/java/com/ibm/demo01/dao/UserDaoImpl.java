package com.ibm.demo01.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import com.ibm.demo01.entity.User;

@Component
public class UserDaoImpl implements UserDao{
    
    @Override
    public String stringUser(User user) {

        System.out.println("hello,UserDaoImpl");
        System.out.println(user.getPassword()+"-"+user.getUsername());

        if(user.getUsername().equals("123")){
            user.setUsername("zsan");
        }else {
            user.setUsername("lsi");
        }

        if (user.getPassword()==456){
            user.setPassword(100);
        }else{
            user.setPassword(200);
        }

        System.out.println("hello,UserDaoImpl");
        
        return user.toString();
    }

    @Override
    public List<User> selectAll(){
        return null;
        
    }



}
