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
public class GetUserVehiclesController {

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

    @PostMapping("/emailSearch")
    public String getUserProfileByEmail(@RequestParam("emailS") String email, Model model){
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "userprofilepage";
    }

    @PostMapping("/afmSearch")
    public String getUserProfileByAfm(@RequestParam("afmS") String afm, Model model){
        User user = userService.findUserByAfm(afm);
        model.addAttribute("user", user);
        return "userprofilepage";
    }
}
