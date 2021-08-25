package com.jeevanmaben.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderfallback")
    public Mono<String> orderCircuitBreaker(){
        return Mono.just("Order API service under maintenance");
    }

    @RequestMapping("/paymentfallback")
    public Mono<String> paymentCircuitBreaker(){
        return Mono.just("Payment API under maintenance");
    }

}
