package com.ibm.demo02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.ibm.demo02.pojo.User;

@Mapper
public interface UserMapper {

    @Select("select * from User")
    public List<User> list();
    
    @Insert("insert into User(username, password) values(#{username}, #{password})")
    public void add(User user);
}
