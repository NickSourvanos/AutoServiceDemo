package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Services.RepairService;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RepairController {

    @Autowired
    private RepairService repairService;

    @Autowired
    private UserService userService;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(value = "/repairs/user")
    public String getRepairsByUser(Model model, @RequestParam("id") Long useId){

        User user = userService.getUserById(useId);
        List<Repair> repairs = repairService.getRepairsByUser(user);
        model.addAttribute("repairs", repairs);
        return "repairs-page";
    }

    @PostMapping(value = "/admin/repairs/createRepair")
    public String createRepair(@ModelAttribute("repair") Repair repair){
        repairService.saveRepair(repair);
        return "redirect:/admin";
    }

    @PostMapping(value = "/admin/repairs/updateRepair")
    public String updateRepair(@RequestParam("vehicleId") Long id,  Repair repair){

        Vehicle vehicle = vehicleService.getVehicleByVehicleId(id);
        System.out.println(vehicle.getVehicleId());
        Repair newRepair = new Repair();
        newRepair.setRepairId(repair.getRepairId());
        newRepair.setVehicle(vehicle);
        newRepair.setCost(repair.getCost());
        newRepair.setDescription(repair.getDescription());
        newRepair.setRepairDate(repair.getRepairDate());
        newRepair.setRepairType(repair.getRepairType());
        newRepair.setStatus(repair.getStatus());

        repairService.saveRepair(newRepair);
        return "redirect:/admin/repairs";
    }
}
