package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Repository.VehicleRepository;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;

@Controller
@RequestMapping(value = "/vehicles")
public class EditVehicleController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping(value = "/vehicle/deleteVehicle")
    public String deleteVehicle(@RequestParam("vehicleId") Long vehicleId){
        Vehicle v = vehicleService.getVehicleByVehicleId(vehicleId);
        vehicleRepository.delete(v);
        return "redirect:/vehicleslistpage";
    }

    @PostMapping(value = "/updateVehicle")
    public String updateVehicle(Vehicle vehicle){
        Vehicle newVehicle = vehicleService.getVehicleByVehicleId(vehicle.getVehicleId());

        newVehicle.setColor(vehicle.getColor());
        newVehicle.setModel(vehicle.getModel());
        newVehicle.setYearOfManufacture(vehicle.getYearOfManufacture());
        newVehicle.setPlateNUmber(vehicle.getPlateNUmber());

        vehicleRepository.save(newVehicle);
        System.out.println(newVehicle.getPlateNUmber());
        return "redirect:/vehicles";
    }
}
