package com.example.controller;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello") // (1)
public class HelloController {

    @Value("${friendly.message}")
    private String message;

    @Get(produces = MediaType.TEXT_PLAIN) // (2)
    public String index() {
        return "Hello "+message; // (3)
    }
}
