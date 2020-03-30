package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class SelfEmployed implements Worker {
    @Autowired
    private Employee contractor;
    private String name;

    public SelfEmployed(Employee contractor, String name) {
        this.contractor = contractor;
        this.name = name;
    }


    public SelfEmployed(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return "Self-Employed";
    }

    public Employee getContractor() {
        return contractor;
    }

    public void setContractor(Employee contractor) {
        this.contractor = contractor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
