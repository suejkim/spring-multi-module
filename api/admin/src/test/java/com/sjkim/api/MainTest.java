package com.sjkim.api;

import com.sjkim.api.main.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class MainTest {

    @Autowired
    private Main main;

    @Test
    void execute() {
        var applicationContext =
                new AnnotationConfigApplicationContext(AdminApplication.class);
        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(">>>>> " + beanName);
        }


        main.execute();
    }
}