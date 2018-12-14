package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Services.RepairService;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RepairController {

    @Autowired
    private RepairService repairService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/repairs/user")
    public String getRepairsByUser(Model model, @RequestParam("id") Long useId){

        User user = userService.getUserById(useId);
        List<Repair> repairs = repairService.getRepairsByUser(user);
        model.addAttribute("repairs", repairs);
        return "repairspage";
    }
}
