package com.company.AutoServiceDemo.Controllers.Rest;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/api")
public class ReadUsersRestController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> findAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping(value = "/user")
    public User getUserById(@RequestParam("id") Long user_id){
        return userService.getUserById(user_id);
    }

    @GetMapping(value = "/user/deleteUser")
    public void deleteUser(@RequestParam("id") Long id) {
        User user = userService.getUserById(id);
        userService.deleteUser(user);
    }
}
