package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Requires;

@ConfigurationProperties(HelloConfig.PREFIX)
@Requires(property = HelloConfig.PREFIX)
public record HelloConfig() {
    public static final String PREFIX = "hello-b";
}
