package com.example.EurekaClient.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class service1Controller {

    @GetMapping("/hello")
    public String service1() {
        return "Hello from Service 1!";
    }

}

