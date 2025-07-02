package br.edu.cerqueira.adailton.microservices.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/check")
    public String health() {
        return "Gateway is up and running!";
    }
}
