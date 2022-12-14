package org.example.events;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    private String message;

    public CustomEvent(Object source) {
        super(source);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
