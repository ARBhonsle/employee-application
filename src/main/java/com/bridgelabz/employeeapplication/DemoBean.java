package com.bridgelabz.employeeapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    private ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }
}
