package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Services.RepairService;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserRepairs {

    @Autowired
    private UserService userService;

    @Autowired
    private RepairService repairService;

    /* READ User's Repairs */
    @GetMapping(value = "/repairs")
    public String getRepairsByUser(Model model, @RequestParam("id") Long useId){

        User user = userService.getUserById(useId);
        List<Repair> repairs = repairService.getRepairsByUser(user);
        model.addAttribute("repairs", repairs);
        return "repairs-page";
    }


}
