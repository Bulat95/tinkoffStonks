package com.example.microstinkoff.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler({StockNotFoundException.class})
    public ResponseEntity<ErrorDTO> handleNotFound(Exception ex){
        return new ResponseEntity<ErrorDTO>(new ErrorDTO(ex.getLocalizedMessage()), HttpStatus.NOT_FOUND);
    }
}
