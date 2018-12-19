package com.company.AutoServiceDemo.security;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/logout")
public class LogoutController {

    @RequestMapping("/")
    public String logout(){
        return "redirect:/login";
    }
}
