package com.regionosago.cms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FineDto {

    private String fineName;
    private int sum;
    private Date fineDate;
}
