package com.philipl.springbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @RequestMapping("/hello")
    public String hello(){
        return "<h1>Hello world!</h1>";
    }
}
