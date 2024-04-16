package com.ibm.demo01;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.demo01.dao.UserDao;
import com.ibm.demo01.entity.User;

@SpringBootTest
class Demo01ApplicationTests {

    @Autowired
    private UserDao userdao;

	@Test
	public void testUser(){
    List<User> userList = userdao.selectAll();
	userList.stream().forEach(user ->{

		System.out.println(user);
	});
	}
	

}
