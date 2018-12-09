package com.company.AutoServiceDemo;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.enums.RoleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AutoServiceDemoApplication {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(AutoServiceDemoApplication.class, args);
	}

/*
	@Override
	public void run(String... args) throws Exception {

		/*
		User user = new User();
		user.setAddress("Panepistimioy 3");
		user.setAfm("687658765");
		user.setEmail("peter@hotmail.com");
		user.setFirstName("Peter");
		user.setLastName("Peri");
		user.setPassword("peterperi");
		user.setRoleType("admin");

		userService.saveUser(user);*/

		//List<User> users = userService.getAllByRoleType("admin");

		//User user = userService.getUserByFirstNameAndLastName("Tom", "Cannot remember");
		//System.out.println("First Name: " + user.getFirstName() + ", Last Name: " + user.getLastName());

		//delete user
		//userService.deleteUserById(user.getId());

		/*for(User u : users){
			System.out.println("First Name: " + u.getFirstName() +
					", Last Name: " + u.getLastName() + ", User id " + u.getId());
		}


	}*/
}
