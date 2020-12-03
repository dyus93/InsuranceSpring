package com.regionosago.cms.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    @GetMapping
    public String MaintenancePage(){
        return "maintenance";
    }
}
