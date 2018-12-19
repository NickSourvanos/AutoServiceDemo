package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Forms.VehicleForm;
import com.company.AutoServiceDemo.Services.RepairService;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping(value = "/admin/vehicles")
public class  VehiclesController {

    @Autowired
    private UserService userService;

    @Autowired
    private RepairService repairService;

    @Autowired
    private VehicleService vehicleService;

    /* CREATE User's Vehicle */
    @PostMapping("/createVehicle")
    public String addVehicle(@Valid VehicleForm vehicle, BindingResult bindingResult){
        String redirect = "redirect:/admin/vehicles/user?id="+vehicle.getUser().toString();

        User user = userService.getUserById(vehicle.getUser());
        Vehicle newVehicle = new Vehicle();

        try{
            if(bindingResult.hasErrors()){
                return redirect;
            }
            newVehicle.setPlateNUmber(vehicle.getPlateNUmber());
            newVehicle.setYearOfManufacture(vehicle.getYearOfManufacture());
            newVehicle.setModel(vehicle.getModel());
            newVehicle.setColor(vehicle.getColor());
            newVehicle.setUser(user);
            vehicleService.saveVehicle(newVehicle);
        }catch(Exception e){
            return redirect;
        }
        return redirect;
    }


    /* READ User's Vehicles */
    @GetMapping("/user")
    public String getUserVehicles(@RequestParam("id") Long userId, Model model){
        User user = userService.getUserById(userId);
        List<Vehicle> vehicles = vehicleService.findAllByUser(user);
        model.addAttribute("vehicles", vehicles);
        model.addAttribute("user", user);
        return "vehicles-page";
    }


    /* UPDATE Vehicle */
    @PostMapping("/updateVehicle")
    public String updateVehicle(Vehicle vehicle){
        String redirect = "redirect:/admin/vehicles/user?id="+vehicle.getUser().getId();
        System.out.println(vehicle.getUser());
        Vehicle newVehicle = vehicleService.getVehicleByVehicleId(vehicle.getVehicleId());

        try{
            newVehicle.setColor(vehicle.getColor());
            newVehicle.setModel(vehicle.getModel());
            newVehicle.setYearOfManufacture(vehicle.getYearOfManufacture());
            newVehicle.setPlateNUmber(vehicle.getPlateNUmber());

            vehicleService.save(newVehicle);
        }catch(Exception e){
            return redirect;
        }

        return redirect;
    }


    /* DELETE a Vehicle by Id */
    @GetMapping("/deleteVehicle")
    public String deleteVehicle(@RequestParam("vehicleId") Long vehicleId){
        Vehicle v = vehicleService.getVehicleByVehicleId(vehicleId);
        List<Repair> repairs = repairService.getRepairsByVehicle(v);
        for(Repair r : repairs){
            repairService.delete(r);
        }
        vehicleService.delete(v);
        return "redirect:/vehicles-list-page";
    }

}
