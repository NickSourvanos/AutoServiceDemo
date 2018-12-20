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
import java.util.logging.Logger;


@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    private Logger logger = Logger.getLogger(getClass().getName());

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

        try{

            User existingUser = userRepository.findUserByEmail(userForm.getEmail());
            String existingEmail = existingUser.getEmail();
            String existingAfm = existingUser.getAfm();

            User newUser = new User();
            newUser.setAfm(userForm.getAfm());
            newUser.setAddress(userForm.getAddress());
            newUser.setEmail(userForm.getEmail());
            newUser.setFirstName(userForm.getFirstName());
            newUser.setLastName(userForm.getLastName());
            newUser.setPassword(passwordEncoder.encode(userForm.getPassword()));
            newUser.setRoleType(userForm.getRoleType());

            if(existingEmail.isEmpty() && existingAfm.isEmpty()){
                userService.saveUser(newUser);
                logger.info("Success!");

                return "redirect:/admin";
            }else{
                logger.info("Afm or Email already exists!");
            }

        }catch (Exception e){
            logger.info("Afm or Email already exists!");
            return "redirect:/admin";
        }

        return "redirect:/admin";
    }

    @PostMapping("/emailSearch")
    public String getUserProfileByEmail(@RequestParam("emailS") String email, Model model){

        try{
            User user = userService.findUserByEmail(email);
            if(user.getEmail().isEmpty()){
                return "redirect:/admin";
            }
            model.addAttribute("user", user);

        }catch(NullPointerException e){
            return "redirect:/admin";
        }

        return "user-profile-page";
    }

    @PostMapping("/afmSearch")
    public String getUserProfileByAfm(@RequestParam("afmS") String afm, Model model){

        try{
            User user = userService.findUserByAfm(afm);
            if(user.getAfm().isEmpty()){
                return "redirect:/admin";
            }
            model.addAttribute("user", user);
        }catch(NullPointerException e){
            return "redirect:/admin";
        }

        return "user-profile-page";
    }

    @PostMapping("/updateUser")
    public String updateUser(User user){

        try{

            User existingUser = userRepository.findUserByEmail(user.getEmail());
            String existingEmail = existingUser.getEmail();
            String existingAfm = existingUser.getAfm();

            User newUser = new User();
            newUser.setAfm(user.getAfm());
            newUser.setAddress(user.getAddress());
            newUser.setEmail(user.getEmail());
            newUser.setFirstName(user.getFirstName());
            newUser.setLastName(user.getLastName());
            newUser.setPassword(user.getPassword());
            newUser.setRoleType(user.getRoleType());

            if(existingEmail.isEmpty() && existingAfm.isEmpty()){
                userService.saveUser(newUser);
                logger.info("success");
                return "redirect:/admin";
            }else {
                logger.info("Afm or Email already exists!");
            }

        }catch (Exception e){
            logger.info("Afm or Email already exists!");
            return "redirect:/admin";
        }

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
