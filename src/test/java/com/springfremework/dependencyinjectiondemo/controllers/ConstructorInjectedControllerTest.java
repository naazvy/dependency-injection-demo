package com.springfremework.dependencyinjectiondemo.controllers;

import com.springfremework.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }


    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_FOLKS, constructorInjectedController.sayHello());
    }
}