package com.sjkim.api;

import com.sjkim.api.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.sjkim"})
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);

        var applicationContext =
                new AnnotationConfigApplicationContext(AdminApplication.class);
        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(">>>>> " + beanName);
        }

        var mainClass = applicationContext.getBean("main", Main.class);
        mainClass.execute();
    }
}