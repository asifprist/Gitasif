package com.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.repositories.UserRepo;
import com.blog.services.UserService;

@SpringBootTest
class BlogAppApisApplicationTests {
	@Autowired
private UserRepo userRepo;
	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
		
	}
	@Test
	public void repoTest() {
		String className = this.userRepo.getClass().getName();
		String packageName = this.userRepo.getClass().getPackageName();
		System.out.println(className);
		System.out.println(packageName);
		
		
	}
	public void serviceTest() {
		String name = this.userService.getClass().getName();
		String packageName2 = this.userService.getClass().getPackageName();
		System.out.println(name);
		System.out.println(packageName2);
		
	}

}
