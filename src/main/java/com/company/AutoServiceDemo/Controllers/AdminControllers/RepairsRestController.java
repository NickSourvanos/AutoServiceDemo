package com.company.AutoServiceDemo.Controllers.AdminControllers;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Services.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/admin/api")
public class RepairsRestController {

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repairs")
    public Repair getRepairsByUser(@ModelAttribute("repair") Repair repair){
        return repairService.saveRepair(repair);
    }

}
