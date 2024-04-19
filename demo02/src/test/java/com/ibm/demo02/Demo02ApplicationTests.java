package com.ibm.demo02;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.demo02.mapper.UserMapper;
import com.ibm.demo02.pojo.User;

@SpringBootTest
class Demo02ApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void testListUder() {
	  List<User> userList =	userMapper.list();
	  userList.stream().forEach(user ->{
		System.out.println(user);
	  });
	}
	
	

}
