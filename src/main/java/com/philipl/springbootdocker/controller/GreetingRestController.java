package com.philipl.springbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class GreetingRestController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello " + Calendar.getInstance());
        return "<h1>Hello world!</h1>";
    }
}
