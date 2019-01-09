package com.learning.sherry;

import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

       /* String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        System.out.println("**************==================**************");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/

    }

    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot";
    }
}
