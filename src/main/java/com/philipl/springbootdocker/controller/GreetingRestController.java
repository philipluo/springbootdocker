package com.philipl.springbootdocker.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
public class GreetingRestController {

    private Logger logger = Logger.getLogger(GreetingRestController.class);

    @RequestMapping("/hello")
    public String hello(){
        String timeString = String.format("%tT%n", new Date());
        logger.info("hello: "+ timeString);
        return "<h1>Hello world, </h1>"+timeString;
    }
}
