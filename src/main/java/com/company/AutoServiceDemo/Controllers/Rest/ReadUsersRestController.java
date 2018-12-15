package com.company.AutoServiceDemo.Controllers.Rest;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Repository.UserRepository;
import com.company.AutoServiceDemo.Services.UserService;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/api")
public class ReadUsersRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> findAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping(value = "/user")
    public User getUserById(@RequestParam("id") Long userId){
        User user = userService.getUserById(userId);
        return user;
    }

    @PostMapping(value = "/deleteUser")
    public void deleteUser(User user){
        userService.deleteUser(user);
    }


}