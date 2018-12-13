package com.company.AutoServiceDemo.Controllers.UserControllers;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class RepairController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/repairs")
    public String getUserRepair(Model model, @ModelAttribute("repairs") Repair repair){
        User user = userRepository.getUserByFirstNameAndLastName("Nick", "Sourvanos");
        model.addAttribute("user", user);
        return "repairs";
    }
}
