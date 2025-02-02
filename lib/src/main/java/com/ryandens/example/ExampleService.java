package com.ryandens.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ExampleService {

    @Inject
    private ExampleConfig exampleConfig;

    public ExampleStrategy getStrategy() {
        return exampleConfig.strategy();
    }
}
