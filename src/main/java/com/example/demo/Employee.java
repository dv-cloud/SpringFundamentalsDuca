package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Employee implements Worker {
    @Autowired
    private SelfEmployed contractor;
    private String name;

    public Employee(SelfEmployed contractor, String name) {
        this.contractor = contractor;
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return "Employee";
    }

    public SelfEmployed getContractor() {
        return contractor;
    }

    public void setContractor(SelfEmployed contractor) {
        this.contractor = contractor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
