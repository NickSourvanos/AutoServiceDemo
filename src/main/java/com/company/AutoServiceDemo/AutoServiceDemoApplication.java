package com.company.AutoServiceDemo;


import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Services.RepairService;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@SpringBootApplication
public class AutoServiceDemoApplication  implements CommandLineRunner {

	private static final Logger LOGGER = Logger.getLogger( TypeData.ClassName.class.getName() );

	@Autowired
	private RepairService repairService;

	public static void main(String[] args) {

		SpringApplication.run(AutoServiceDemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		List<Repair> repairList = repairService.findFirst10ByOrderByRepairDateAsc();



		for(Repair r : repairList){
			LOGGER.info(r.getRepairDate());
		}
	}
}
