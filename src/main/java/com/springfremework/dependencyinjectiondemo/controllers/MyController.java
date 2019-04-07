package com.springfremework.dependencyinjectiondemo.controllers;
import com.springfremework.dependencyinjectiondemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello world!");
        return greetingService.sayGreeting();
    }
}
