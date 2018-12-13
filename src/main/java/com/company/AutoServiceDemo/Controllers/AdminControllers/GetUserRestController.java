package com.company.AutoServiceDemo.Controllers.AdminControllers;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Services.UserService;
import org.apache.coyote.Response;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
import java.util.MissingResourceException;
import java.util.Optional;

@RestController
@RequestMapping(value = "/admin/api")
public class GetUserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User hello(@RequestParam(value="id") Long user_id) {
        try {
            return userService.getUserById(user_id);
        } catch (Exception ex) {
            return null;
        }
    }

    @PostMapping(value = "/user/updateUser")
    public User getUserById(@RequestParam("id") Long user_id){
        User user = userService.getUserById(user_id);
        return user;
    }

}
