package com.springfremework.dependencyinjectiondemo.controllers;

import com.springfremework.dependencyinjectiondemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
