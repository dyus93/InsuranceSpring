package com.regionosago.cms.controllers;

import com.regionosago.cms.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class InsuranceController {

    private final CarService carService;

    @GetMapping("/")
    public String index(){
//        model.addAttribute("cars", carService.findAll());
        return "index";
    }
    @GetMapping("/index")
    public String IndexPage(){
//        model.addAttribute("cars", carService.findAll());
        return "index";
    }

    @GetMapping("/cars")
    public String CarPage(){
//        model.addAttribute("cars", carService.findAll());
        return "cars";
    }

    @GetMapping("/owner")
    public String ClientsPage(){
//        model.addAttribute("cars", carService.findAll());
        return "owner";
    }
}
