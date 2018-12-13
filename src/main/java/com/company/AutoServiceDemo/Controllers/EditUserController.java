package com.company.AutoServiceDemo.Controllers;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Repository.UserRepository;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/user")
public class EditUserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/createUser")
    public String createUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/";
    }

    @PostMapping("/updateUser")
    public String updateUser(User user){

        User newUser = userService.getUserById(user.getId());

        newUser.setAfm(user.getAfm());
        newUser.setEmail(user.getEmail());
        newUser.setAddress(user.getAddress());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setRoleType(user.getRoleType());

        userRepository.save(user);
        return "redirect:/";
    }

    @GetMapping(value = "/deleteUser")
    public String deleteUser(User user){
        userService.deleteUser(user);
        return "redirect:/";

    }
}
