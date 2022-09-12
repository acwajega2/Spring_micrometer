package com.example.prom.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {


    @GetMapping(value = "/sayHello",produces= MediaType.APPLICATION_JSON_VALUE)
    public String sayHello(){
        return "Hello";
    }



}
