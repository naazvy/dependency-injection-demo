package com.springfremework.dependencyinjectiondemo.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_FOLKS = "Hello Folks!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_FOLKS;
    }
}
