package com.company.AutoServiceDemo.Controllers.AdminControllers;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/api/vehicles")
public class VehiclesController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String getUserVehicles(@RequestParam("user") User user, Model model){
        List<Vehicle> vehicles = vehicleService.getAllByUser(user);
        model.addAttribute("vehicles", vehicles);
        return "vehicles";
    }
}
