package com.company.AutoServiceDemo;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Services.RepairService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


@SpringBootApplication
public class AutoServiceDemoApplication  implements CommandLineRunner {

	@Autowired
	private RepairService repairService;

	public static void main(String[] args) {

		SpringApplication.run(AutoServiceDemoApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		List<Repair> repairs = repairService.findRepairsByRepairDateBetween("2018-12-5", "2018-12-19");
		for(Repair r : repairs){
			System.out.println(r.getRepairDate());
		}
	}
}
