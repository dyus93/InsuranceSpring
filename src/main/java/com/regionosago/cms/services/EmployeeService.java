package com.regionosago.cms.services;

import com.regionosago.cms.dto.EmployeeDto;
import com.regionosago.cms.persistence.entities.Employees;
import com.regionosago.cms.persistence.repositories.EmployeeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public Optional<Employees> getOneById(UUID id){
        return employeeRepository.findById(id);
    }

    public List<Employees> findAll(){
        return employeeRepository.findAll();
    }

    public String save(EmployeeDto employeeDto){
        Employees employee = Employees.builder()
                .surname(employeeDto.getSurname())
                .name(employeeDto.getName())
                .patronymic(employeeDto.getPatronymic())
                .getJob(employeeDto.getGetJob())
                .post(employeeDto.getPost())
                .passport(employeeDto.getPassport())
        .build();

        employeeRepository.save(employee);
        return "redirect:/";
    }
}
