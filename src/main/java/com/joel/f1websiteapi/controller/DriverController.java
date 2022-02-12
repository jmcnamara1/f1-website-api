package com.joel.f1websiteapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.joel.f1websiteapi.model.Driver;

@RestController()
public class DriverController {


    @GetMapping("/driver")
    public Driver driverIndex() {
        System.out.println("Driver index was hit");
        return new Driver();
    }


    @GetMapping("/driver/{id}")
    public Driver driverById(@PathVariable String id) {
        System.out.println("Driver id was hit");
        return new Driver();
    }


    @GetMapping("/driver/{code}")
    public Driver driverByCode(@PathVariable String code) {
        System.out.println("Driver code was hit");
        return new Driver();
    }

    
}
