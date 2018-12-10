package com.company.AutoServiceDemo;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Enums.RoleType;
import com.company.AutoServiceDemo.Services.RepairService;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Provider;
import java.util.List;

@SpringBootApplication
public class AutoServiceDemoApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private RepairService repairService;

	public static void main(String[] args) {
		SpringApplication.run(AutoServiceDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		//Add car to service
		Vehicle vehicle = vehicleService.findVehicleByPlateNUmber("QWE-1234");

		//List<Repair> repairs = vehicleService


		/*
		User user = userService.getUserByFirstNameAndLastName("Tom", "Koumassis");

		userService.deleteUser(user);

		List<User> users = userService.getAllByRoleType(RoleType.SIMPLE_USER_ROLE);
		for(User u : users){
			System.out.println("First Name: " + u.getFirstName() + ", Last Name: " + u.getLastName());
		}
		//Delete user
		/*User user = userService.getUserByFirstNameAndLastName("Peter", "Peri");

		userService.deleteUser(user);*/
		/*
		List<User> users = userService.getAllByRoleType(RoleType.SIMPLE_USER_ROLE);
		for(User user : users){
			System.out.println("First Name: " + user.getFirstName() + ", Last Name: " + user.getLastName());
		}

		//User user = userService.getUserByFirstNameAndLastName("Nick", "Sourvanos");
		//User userN = userService.findUserBy(user);

		//System.out.println("User: " + userN.getAfm());

		//Get repair type by vehicle and parts
		/*
		Vehicle vehicle = vehicleService.findVehicleByPlateNUmber("QWE-1234");
		List<Repair> vehicleRepairs = repairService.getAllByVehicle(vehicle);
		for(Repair repair : vehicleRepairs){
			System.out.println("Repair Description: " + repair.getDescription() + ", Part: " + repair.getPart().getType());
		}


		//Get vehicles by user
		User user = userService.getUserByFirstNameAndLastName("Nick", "Sourvanos");
		List<Vehicle> vehicles = vehicleService.getAllByUser(user);
		for(Vehicle vehicle : vehicles){
			System.out.println("Vehicle: " + vehicle.getPlateNUmber());
		}


		//Create user
		User user = new User();
		user.setAddress("Panepistimioy 3");
		user.setAfm("687658765");
		user.setEmail("peter@hotmail.com");
		user.setFirstName("Peter");
		user.setLastName("Peri");
		user.setPassword("peterperi");
		user.setRoleType(RoleType.SIMPLE_USER_ROLE);

		userService.saveUser(user);

		//Get user by role type
		List<User> users = userService.getAllByRoleType("admin");
		User user = userService.getUserByFirstNameAndLastName("Tom", "Cannot remember");
		System.out.println("First Name: " + user.getFirstName() + ", Last Name: " + user.getLastName());

		//delete user
		//userService.deleteUserById(user.getId());
		*/


	}
}
