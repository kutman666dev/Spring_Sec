package com.example.perfect.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        // Логируем ошибку
        e.printStackTrace();
        return "error"; // Путь к файлу error.html
    }
}
