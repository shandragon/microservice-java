package br.edu.cerqueira.adailton.microservices.card.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/card")
public class HealthController {
    private static final Logger log = LoggerFactory.getLogger(HealthController.class);
    //private WebClient webClient;

    @Value("${tcgc.url.user}")
    private String urlUser;

    public HealthController() {
        log.info("Valor do urlUser: " + this.urlUser);
        this.urlUser += "/user";
        //this.webClient = webClient;
    }

    @GetMapping("/check")
    public String health() {
        return "Gateway is up and running!";
    }

    @GetMapping("/ping")
    public String ping() {
//        SecurityContext context = SecurityContextHolder.getContext();
//        Authentication authentication = context.getAuthentication();
//
//        String scopes = webClient
//                .get()
//                .uri(urlUser + "/ping")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//        return "Callme scopes: " + scopes;
        return "Ping";
    }
}
