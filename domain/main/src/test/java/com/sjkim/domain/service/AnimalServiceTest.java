package com.sjkim.domain.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnimalServiceTest {

    @Autowired
    private AnimalService animalService;

    @Test
    void actAnimal() {
//        animalService.actAnimal(new Cat());
    }

    @Test
    void getAnimalName() {
    }
}