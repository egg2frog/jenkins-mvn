package com.egg2frog.springbeginner.jenkinsmvn.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(path = "/greeter", method = RequestMethod.GET)
    public String getGreeting() {
        return "Howdy? Now the time is ";
    }
}
