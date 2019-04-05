package com.springfremework.dependencyinjectiondemo;

import com.springfremework.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import com.springfremework.dependencyinjectiondemo.controllers.MyController;
import com.springfremework.dependencyinjectiondemo.controllers.PropertyInjectedController;
import com.springfremework.dependencyinjectiondemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =
          SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        MyController controller = (MyController)context.getBean("myController");
        controller.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());

    }

}
