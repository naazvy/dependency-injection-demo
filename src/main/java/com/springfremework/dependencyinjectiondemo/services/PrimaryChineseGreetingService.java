package com.springfremework.dependencyinjectiondemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("chi")
@Primary
public class PrimaryChineseGreetingService implements GreetingService{
    private GreetingRepository greetingRepository;

    public PrimaryChineseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGetChineseGreeting();
    }
}
