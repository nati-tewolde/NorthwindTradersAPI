package com.pluralsight.NorthwindTradersAPI.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/country", method = RequestMethod.GET)
    public String getRequest(@RequestParam(defaultValue = "World") String countryName) {
        return "Hello " + countryName + "!";
    }
}
