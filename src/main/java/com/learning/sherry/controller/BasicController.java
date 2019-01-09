package com.learning.sherry.controller;

import com.learning.sherry.entity.WelcomeBean;
import com.sun.tools.javac.comp.Todo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class BasicController {

    private static final String helloWorldTemplate = "Hello World, %s!";

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World";
    }

    @GetMapping("/welcome-with-object")
    public WelcomeBean welcomeWithObject() {
        return new WelcomeBean("Hello World");
    }

    @GetMapping("/welcome-with-parameter/name/{name}")
    public WelcomeBean welcomeWithParameter(@PathVariable String name)
    {
        return new WelcomeBean(String.format(helloWorldTemplate, name));
    }

    @GetMapping(path = "/users/dummy-service")
    public Todo errorService() {
        throw new RuntimeException("Some Exception Occured");
    }
}
