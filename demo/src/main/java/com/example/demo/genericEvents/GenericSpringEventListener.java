package com.example.demo.genericEvents;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventListener {
    @EventListener(condition = "#event.success")
    @Async
    public void handleSuccessful(GenericSpringEvent<Transaction> event) {
        System.out.println("Handling generic event (conditional). "+ event.getWhat().getData());
    }
}