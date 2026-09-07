package com.sudeep.development.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        String x;
        String y;
        callSun(x,y);
        return "sudeep dev branch"
        
    }
