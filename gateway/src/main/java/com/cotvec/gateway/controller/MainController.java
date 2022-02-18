package com.cotvec.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${user.role}")
    private String testValue;

    @GetMapping("/value")
    public String getTestValue (){
        return testValue;
    }

}
