package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Repository.UserRepository;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/admin/user")
public class EditUserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/createUser")
    public String createUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/admin";
    }


    @PostMapping("/emailSearch")
    public String getUserProfileByEmail(@RequestParam("emailS") String email, Model model){
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "userprofilepage";
    }

    @PostMapping("/afmSearch")
    public String getUserProfileByAfm(@RequestParam("afmS") String afm, Model model){
        User user = userService.findUserByAfm(afm);
        model.addAttribute("user", user);
        return "userprofilepage";
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
        return "redirect:/admin";
    }

   /* @GetMapping(value = "/deleteUser")
    public String deleteUser(User user){
        userService.deleteUser(user);
        return "redirect:/admin";
    }*/
}
