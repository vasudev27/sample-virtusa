package com.virtusa.sample.numberToWordConverter.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = {Exception.class})
    public String handleUnknownException(Exception ex) {

        log.error(ex.getMessage(), ex);
        return "Internal Server Error";
    }

    @ExceptionHandler(value = {IllegalArgumentException.class})
    public String handleIllegalArgumentException(IllegalArgumentException ex) {

        log.error(ex.getMessage(), ex);
        return "Invalid Positive Integer";
    }


}
