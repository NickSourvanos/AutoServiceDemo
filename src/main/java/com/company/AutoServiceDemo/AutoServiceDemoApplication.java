package com.company.AutoServiceDemo;

import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Services.PartService;
import com.company.AutoServiceDemo.Services.RepairService;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoServiceDemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(AutoServiceDemoApplication.class, args);
	}
}
