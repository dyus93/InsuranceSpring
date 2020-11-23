package com.regionosago.cms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarNotFoundException extends Exception{

    private static final long serialUUID = 1L;

    public CarNotFoundException(String message){
        super(message);
    }
}
