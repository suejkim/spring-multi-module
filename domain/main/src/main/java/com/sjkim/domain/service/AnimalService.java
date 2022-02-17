package com.sjkim.domain.service;

import com.sjkim.domain.animal.Animal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalService {

    public boolean actAnimal(Animal animal) {
        return animal.act();
    }

    public String getAnimalName(Animal animal) {
        return animal.applyName("러블리");
    }
}
