package com.regionosago.cms.controllers;

import com.regionosago.cms.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class InsuranceController {

    private final CarService carService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("cars", carService.findAllCars());
        return "index";
    }
//    @GetMapping("/index")
//    public String IndexPage(){
////        model.addAttribute("cars", carService.findAll());
//        return "index";
//    }
//
//    @GetMapping("/cars")
//    public String CarPage(){
////        model.addAttribute("cars", carService.findAll());
//        return "cars";
//    }
//
//    @GetMapping("/owner")
//    public String ClientsPage(){
////        model.addAttribute("cars", carService.findAll());
//        return "owner";
//    }
}
