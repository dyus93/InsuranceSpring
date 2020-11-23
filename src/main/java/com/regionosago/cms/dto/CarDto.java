package com.regionosago.cms.dto;

import com.regionosago.cms.persistence.entities.TO;
import com.regionosago.cms.persistence.entities.enums.CarStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private String model;
    private String serial;
    private String number;
    private String vinCode;
    private int year;
//    private CarStatus status;
    private TO to;
}
