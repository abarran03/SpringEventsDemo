package com.example.demo.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @EventListener
    @Async
    public void processMessageEvent(MessageEvent event) throws InterruptedException {
        Thread.sleep(5000);
        logger.info("Event received, content = " + event.getMessage() + ", timestamp " + event.getTimestamp());
    }
}