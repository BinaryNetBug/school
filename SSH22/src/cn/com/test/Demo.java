package cn.com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.entity.User;
import cn.com.service.UserService;

public class Demo {
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void test(){
		UserService userService = (UserService) context.getBean("userService");
		userService.insertUser(new User(0,"张盟","ssss"));
	}
}
