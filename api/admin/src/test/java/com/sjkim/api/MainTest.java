package com.sjkim.api;

import com.sjkim.api.main.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainTest {

    @Autowired
    private Main main;

    @Test
    void execute() {
        main.execute();
    }
}