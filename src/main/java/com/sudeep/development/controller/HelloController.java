package com.sudeep.development.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        int a,b;
        mul(a,b);
        return "I am changing in Sudeep1 branch  xyz";
        
    }
}
