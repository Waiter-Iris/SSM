package cn.zzz.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zzz.pojo.User;
import cn.zzz.service.UserService;

public class SSMTest {
	public UserService service;

	@Before
	public void init() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		service = (UserService) appContext.getBean("userService");
	}

	@Test
	public void findAll() {
		List<User> users = service.findAll();

		for (User u : users) {
			System.out.println(u);
		}

	}

	@Test
	public void findById() {
		User u = service.findById(1);

		System.out.println(u);

	}

	@Test
	public void save() {
		User u = new User();
		u.setId(6);
		u.setUser_name("xiaomi");
		u.setAge(10);
		u.setRemark("shenzhen");

		service.save(u);

	}

	@Test
	public void remove() {
		User u = new User();
		u.setId(6);

		service.remove(u);

	}

	@Test
	public void change() {
		User u = new User();
		u.setId(6);
		u.setUser_name("meizu");
		u.setAge(5);
		u.setRemark("dalian");

		service.change(u);

	}

}
