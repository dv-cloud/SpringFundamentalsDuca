package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.example.demo")
public class ConfigClass {
    @Bean
    @Qualifier("lawyer")
    public Employee getEmployee(){
       String name = "Lawyer";
       return new Employee(name);
    }

    @Bean
    @Qualifier("doctor")
    public Employee getEmployee2(){
        String name = "Doctor";
        return new Employee(name);
    }

    @Bean
    public SelfEmployed getSelfEmployed(){
        String name = "Freelancer";
        return new SelfEmployed(name);
    }
}
