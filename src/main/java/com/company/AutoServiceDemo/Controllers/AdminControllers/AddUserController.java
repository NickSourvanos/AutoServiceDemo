package com.company.AutoServiceDemo.Controllers.AdminControllers;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/admin")
public class AddUserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/createUser")
    public String createUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/admin";
    }
}
