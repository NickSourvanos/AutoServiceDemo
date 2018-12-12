package com.company.AutoServiceDemo.Controllers;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Enums.RoleType;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class AdminPageController {


    @Autowired
    private UserService userService;
    private List<User> users;

    @PostConstruct
    public void initList(){
        users = userService.getAllByRoleType(RoleType.SIMPLE_USER_ROLE);
    }

    @GetMapping("/")
    public String index(){
        return "adminpage";
    }

    @PostMapping("/")
    public String getAdminPage(){
        return "adminpage";
    }


}
