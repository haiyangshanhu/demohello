package com.ibm.demo01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ibm.demo01.entity.User;

@Mapper
public interface UserDao {
   
   public String stringUser(User user);

   @Select("select * from user;")
   public List<User> selectAll();
   
}
