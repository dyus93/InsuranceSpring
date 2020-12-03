package com.regionosago.cms.controllers;

import com.regionosago.cms.services.CarService;
import com.regionosago.cms.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class InsuranceController {

    private final CarService carService;
    private final UserService userService;

    @GetMapping("/login")
    public String login( ){
        return "login";
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("cars", carService.findAllCars());
        return "index";
    }
}
