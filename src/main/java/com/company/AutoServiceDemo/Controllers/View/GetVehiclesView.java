package com.company.AutoServiceDemo.Controllers.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetVehiclesView {

    @GetMapping(value = "/vehicles")
    public String getVehiclesPage(){
        return "vehicleslistpage";
    }

}
