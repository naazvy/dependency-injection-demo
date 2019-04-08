package com.springfremework.dependencyinjectiondemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryServiceImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello primaryGreetingService!";
    }

    @Override
    public String getGetChineseGreeting() {
        return "大家好！";
    }

    @Override
    public String getGetGermanGreeting() {
        return "Hallo Leute !";
    }
}
