package com.example.demo.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    DemoPublisherService service;

    @GetMapping(path = "/test")
    public String test() throws InterruptedException {
        return service.doSomething();

    }
}
