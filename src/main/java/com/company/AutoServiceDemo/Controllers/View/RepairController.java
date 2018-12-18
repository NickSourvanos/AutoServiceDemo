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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "admin")
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

    @PostMapping(value = "/repairs/createRepair")
    public String createRepair(@ModelAttribute("repair") Repair repair){
        repairService.saveRepair(repair);
        return "redirect:/admin";
    }

    @PostMapping(value = "/repairs/updateRepair")
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

    @GetMapping(value = "/repairs/byDate")
    public String getRepairsByDateRange(Model model, @RequestParam("startDate") String sDate,@RequestParam("endDate") String eDate) {

        List<Repair> repairs = repairService.findByRepairDateBetween(sDate,eDate);
        model.addAttribute("repairs", repairs);

        return "filtered-repairs-page";
    }

    @GetMapping(value = "/repairs/byAfm")
    public String getRepairsByAfm(Model model, @RequestParam("afm") String afm) {

        if(!afm.isEmpty()){
            try{
                User user = userService.findUserByAfm(afm);

                if(!user.getAfm().isEmpty()){
                    List<Repair> repairs = repairService.getRepairsByVehicle_User_Afm(afm);
                    model.addAttribute("repairs", repairs);
                    model.addAttribute("firstName", user.getFirstName());
                    model.addAttribute("lastName", user.getLastName());
                    return "repairs-page";
                }

            }catch(NullPointerException e){
                return "redirect:/admin/repairs";
            }
        }


        return "redirect:/admin/repairs";
    }

    @GetMapping(value = "/repairs/byPlate")
    public String getRepairsByPlate(Model model, @RequestParam("plateNUmber") String plate) {

        if(!plate.isEmpty()){
            try{
                Vehicle vehicle = vehicleService.findVehicleByPlateNUmber(plate);
                if(!vehicle.getPlateNUmber().isEmpty()){
                    User user = userService.findUserByVehicles(vehicle);
                    List<Repair> repairs = repairService.getRepairsByVehicle_PlateNUmber(plate);
                    model.addAttribute("repairs", repairs);
                    model.addAttribute("firstName", user.getFirstName());
                    model.addAttribute("lastName", user.getLastName());
                    return "repairs-page";
                }

            }catch(NullPointerException e){
                return "redirect:/admin/repairs";
            }

        }


        return "redirect:/admin/repairs";
    }
}
