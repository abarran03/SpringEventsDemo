package com.example.demo.genericEvents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service
public class DemoPublisherGenericEventsService {

    private static final Logger logger =  LoggerFactory.getLogger(DemoPublisherGenericEventsService.class);

    private final ApplicationEventPublisher publisher;

    public DemoPublisherGenericEventsService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public String doSomething() throws InterruptedException {
        logger.info("init doSomething method 2");
        Transaction t = new Transaction("1","transactional info");
        GenericSpringEvent genericSpringEvent = new GenericSpringEvent(t, true);
        publisher.publishEvent(genericSpringEvent);
        logger.info("event was published 2 ");
        return "event was published 2";
    }
}
