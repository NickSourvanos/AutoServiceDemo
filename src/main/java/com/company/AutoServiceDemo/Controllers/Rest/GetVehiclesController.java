package com.company.AutoServiceDemo.Controllers.Rest;

import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/api")
public class GetVehiclesController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(value = "/vehicles")
    public List<Vehicle> getVehiclesList(){
        return vehicleService.findAllVehicles();
    }

    @GetMapping(value = "/vehicle")
    public Vehicle getVehicle(@RequestParam("vehicleId") Long id){
        return vehicleService.getVehicleByVehicleId(id);
    }

}
