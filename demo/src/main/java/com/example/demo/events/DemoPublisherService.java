package com.example.demo.events;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;


@Service
public class DemoPublisherService {

    private static final Logger logger =  LoggerFactory.getLogger(DemoPublisherService.class);

    private final ApplicationEventPublisher publisher;

    public DemoPublisherService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public String doSomething() throws InterruptedException {
        logger.info("init doSomething method");
        MessageEvent messageEvent = new MessageEvent(this, "Hello!!");
        publisher.publishEvent(messageEvent);
        logger.info("event was published");
        return "event was published";
    }
}
