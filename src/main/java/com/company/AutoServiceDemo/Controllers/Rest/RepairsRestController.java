package com.company.AutoServiceDemo.Controllers.Rest;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Services.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/api")
public class RepairsRestController {

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/repairs")
    public List<Repair> last10Repairs(){
        return repairService.findFirst10ByOrderByRepairDateDesc();
    }

    @GetMapping(value = "/repair")
    public Repair getRepair(@RequestParam(value = "id") Long repairId){
        return repairService.findRepairByRepairId(repairId);
    }

    @GetMapping(value = "/repairs/deleteRepair")
    public void deleteRepair(@RequestParam(value = "id") Long repairId){
        Repair repair = repairService.findRepairByRepairId(repairId);
        repairService.delete(repair);
    }

}
