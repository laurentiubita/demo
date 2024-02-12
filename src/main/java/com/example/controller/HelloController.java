package com.example.controller;

import com.example.client.HelloClient;
import io.micronaut.context.annotation.Value;
import io.micronaut.core.async.annotation.SingleResult;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller("/hello") // (1)
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);


    private HelloClient helloClient;

    @Value("${friendly.message}")
    private String message;
    public HelloController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }


    @Get(produces = MediaType.APPLICATION_JSON) // (2)
    @SingleResult
    Publisher<ResponseDTO> fetchReleases() {
        LOGGER.info("/hello called in micronaut");
        return helloClient.fetchReleases();
    }
}
