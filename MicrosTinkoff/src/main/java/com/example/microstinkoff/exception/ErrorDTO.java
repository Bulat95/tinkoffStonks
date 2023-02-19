package com.example.microstinkoff.exception;


import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ErrorDTO {
    private String error;
}
