package com.example.demo.genericEvents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerGenericEvents {
    @Autowired
    DemoPublisherGenericEventsService service;

    @GetMapping(path = "/genericEvents")
    public String test() throws InterruptedException {
        return service.doSomething();

    }
}
