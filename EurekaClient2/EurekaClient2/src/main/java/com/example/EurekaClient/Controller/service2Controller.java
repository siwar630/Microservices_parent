package com.example.EurekaClient.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class service2Controller {

    @GetMapping("/hello")
    public String service2() {
        return "Hello from Service 2!";
    }

}

