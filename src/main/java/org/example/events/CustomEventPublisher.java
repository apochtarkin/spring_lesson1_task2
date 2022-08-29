package org.example.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(String message) {
        CustomEvent ev = new CustomEvent(this);
        ev.setMessage("publishing event with message: " + message);
        applicationEventPublisher.publishEvent(ev);
    }
}
