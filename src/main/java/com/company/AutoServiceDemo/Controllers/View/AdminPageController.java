package com.company.AutoServiceDemo.Controllers.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin" )
public class AdminPageController {

    @GetMapping
    public String addUser(){
        return "adminpage";
    }

}
