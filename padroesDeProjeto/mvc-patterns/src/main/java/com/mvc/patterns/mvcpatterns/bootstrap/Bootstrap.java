package com.mvc.patterns.mvcpatterns.bootstrap;

import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class Bootstrap implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("FUNCIONANDO");
        System.out.println("FUNCIONANDO");
        System.out.println("FUNCIONANDO");
        System.out.println("FUNCIONANDO");
        System.out.println("FUNCIONANDO");

    }
}