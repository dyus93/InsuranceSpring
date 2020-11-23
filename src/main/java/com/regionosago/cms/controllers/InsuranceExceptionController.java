package com.regionosago.cms.controllers;

import com.regionosago.cms.exceptions.CarNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class InsuranceExceptionController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CarNotFoundException.class)
    public String handleCarNotFoundException(final CarNotFoundException ex){
        log.error("Car not found thrown", ex);
        return "error";
    }
}
