package com.company.AutoServiceDemo.Controllers;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Services.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class RepairsController {

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repairs")
    public Repair getRepairsByUser(@ModelAttribute("repair") Repair repair){
        return repairService.saveRepair(repair);
    }

}
