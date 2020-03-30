package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class SelfEmployed implements Worker {
    @Autowired
    @Qualifier("doctor")
    private Employee contractor;
    @Autowired
    @Qualifier("lawyer")
    private Employee contractor2;
    private String name;

    public SelfEmployed(Employee contractor, String name) {
        this.contractor = contractor;
        this.name = name;
    }

    public SelfEmployed(Employee contractor2) {
        this.contractor2 = contractor2;
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

    public Employee getContractor2() {
        return contractor2;
    }

    public void setContractor2(Employee contractor2) {
        this.contractor2 = contractor2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
