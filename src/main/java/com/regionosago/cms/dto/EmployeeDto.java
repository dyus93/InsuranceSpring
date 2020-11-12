package com.regionosago.cms.dto;

import com.regionosago.cms.persistence.entities.Passport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String surname;
    private String name;
    private String patronymic;
    private Date getJob;
    private String post;
    private Passport passport;
}
