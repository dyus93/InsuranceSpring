package com.regionosago.cms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassportDto {
    private int serial;
    private int number;
    private Date dateBirth;
    private Date getPassport;
    private int code;
    private String orgGave;
    private String registration;
}
