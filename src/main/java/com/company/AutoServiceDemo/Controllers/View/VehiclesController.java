package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Forms.VehicleForm;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/admin/vehicles")
public class  VehiclesController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private UserService userService;


    @GetMapping("/user")
    public String getUserVehicles(@RequestParam("id") Long userId, Model model){
        User user = userService.getUserById(userId);
        List<Vehicle> vehicles = vehicleService.findAllByUser(user);
        model.addAttribute("vehicles", vehicles);
        return "vehicles-page";
    }

    @PostMapping("/user/addVehicle")
    public String addVehicle(@Valid VehicleForm vehicle, BindingResult bindingResult){
        String redirect = "redirect:/admin/vehicles/user?id="+vehicle.getUser().toString();
        User user = userService.getUserById(vehicle.getUser());
        Vehicle newVehicle = new Vehicle();

        if(bindingResult.hasErrors()){
            return redirect;
        }
        newVehicle.setPlateNUmber(vehicle.getPlateNUmber());
        newVehicle.setYearOfManufacture(vehicle.getYearOfManufacture());
        newVehicle.setModel(vehicle.getModel());
        newVehicle.setColor(vehicle.getColor());
        newVehicle.setUser(user);
        vehicleService.saveVehicle(newVehicle);

        return redirect;
    }



}
