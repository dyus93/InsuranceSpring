package com.regionosago.cms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverLicenseDto {
    private String number;
    private Date getLicense;
    private Date changeLicense;
}
