package com.regionosago.cms.controllers;

import com.regionosago.cms.persistence.entities.Employees;
import com.regionosago.cms.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public String findAll(Model model){
        List<Employees> employees = employeeService.findAll();
        model.addAttribute("employee", employees);
        return "employees";
    }
}
