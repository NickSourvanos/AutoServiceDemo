package com.company.AutoServiceDemo.Controllers;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class GetUsersController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> findAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

}
