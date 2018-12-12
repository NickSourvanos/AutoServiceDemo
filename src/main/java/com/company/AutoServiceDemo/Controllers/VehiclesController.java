package com.company.AutoServiceDemo.Controllers;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/vehicles")
public class VehiclesController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String getUserVehicles(Long userId, Model model){
        User user = userService.getUserById(userId);
        List<Vehicle> vehicles = vehicleService.findAllByUser(user);
        model.addAttribute("vehicles", vehicles);
        return "vehicles";
    }




}
