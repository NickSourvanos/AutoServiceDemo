package com.company.AutoServiceDemo.Controllers.View;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Forms.AddUserForm;
import com.company.AutoServiceDemo.Repository.UserRepository;
import com.company.AutoServiceDemo.Services.UserService;
import com.company.AutoServiceDemo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/createUser")
    public String createUser(@Valid  @ModelAttribute("addUserForm") AddUserForm userForm,
                             BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("message", "an error occurred");
            return "redirect:/admin";
        }

        User newUser = new User();
        newUser.setAfm(userForm.getAfm());
        newUser.setAddress(userForm.getAddress());
        newUser.setEmail(userForm.getEmail());
        newUser.setFirstName(userForm.getFirstName());
        newUser.setLastName(userForm.getAfm());
        newUser.setPassword(passwordEncoder.encode(userForm.getPassword()));
        newUser.setRoleType(userForm.getRoleType());

        Optional<User> dublicateUser = userRepository.getUserByAfmAndEmail(userForm.getAfm(), userForm.getEmail());

        if(dublicateUser.isEmpty()){
            userService.saveUser(newUser);
            model.addAttribute("message", "Success");
        }

        return "redirect:/admin";
    }

    @PostMapping("/emailSearch")
    public String getUserProfileByEmail(@RequestParam("emailS") String email, Model model){
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "user-profile-page";
    }

    @PostMapping("/afmSearch")
    public String getUserProfileByAfm(@RequestParam("afmS") String afm, Model model){
        User user = userService.findUserByAfm(afm);

        model.addAttribute("user", user);
        return "user-profile-page";
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

    @PostMapping("/userProfileUpdate")
    public String UserProfileUpdate(User user){

        User newUser = userService.getUserById(user.getId());

        newUser.setAfm(user.getAfm());
        newUser.setEmail(user.getEmail());
        newUser.setAddress(user.getAddress());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setRoleType(user.getRoleType());

        userRepository.save(user);
        return "user-profile-page";
    }

    @GetMapping(value = "/deleteUser")
    public String deleteUser(User user){
        userService.deleteUser(user);
        List<Vehicle> vehicles = vehicleService.findAllByUser(user);

        for(Vehicle v : vehicles){
            vehicleService.delete(v);
        }

        return "redirect:/admin";
    }
}
