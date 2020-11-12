package com.regionosago.cms.dto;

import com.regionosago.cms.persistence.entities.DriverLicense;
import com.regionosago.cms.persistence.entities.Passport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private String surname;
    private String name;
    private String patronymic;
    private Passport passport;
    private DriverLicense driverLicense;

}
