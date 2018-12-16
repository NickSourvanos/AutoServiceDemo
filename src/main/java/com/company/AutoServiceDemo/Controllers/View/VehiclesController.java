package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@RequestMapping(value = "/admin/vehicles")
public class VehiclesController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUserVehicles(@RequestParam("id") Long userId, Model model){
        User user = userService.getUserById(userId);
        List<Vehicle> vehicles = vehicleService.findAllByUser(user);
        model.addAttribute("vehicles", vehicles);
        return "vehiclespage";
    }

    @PostMapping("/user/addVehicle")
    public String addVehicle(Vehicle vehicle){
        String redirect = "redirect:/admin/vehicles/user?id="+vehicle.getUser().getId().toString();
        vehicleService.saveVehicle(vehicle);

        return redirect;
    }
}
