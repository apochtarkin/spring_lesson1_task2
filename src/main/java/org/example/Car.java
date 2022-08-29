package org.example;

import org.example.events.CustomEvent;
import org.example.events.CustomEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class Car {
    private boolean partsDelivered;

    public Car() {
        Random r = new Random();
        this.partsDelivered = r.nextBoolean();
        if (this.partsDelivered) {
            AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
            CustomEventPublisher ceb = ctx.getBean("customEventPublisher", CustomEventPublisher.class);
            //CustomEventPublisher ceb = new CustomEventPublisher();
            ceb.publishCustomEvent("car built");
        }
    }

    public boolean isPartsDelivered() {
        return partsDelivered;
    }
}
