package net.sqlconnector.sqlConnector.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheck {
    @GetMapping("/health")
    public String helthCheck(){
        System.out.println("Health Check");
        return "Health Check";
    }
}
