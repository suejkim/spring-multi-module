package com.sjkim.api.abstract_test;

import com.sjkim.animal.Animal;
import com.sjkim.animal.AnimalService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BaseAnimalController {

    private final List<AnimalService> animalServices;

    public AnimalService getAnimalService(Animal animal) {
        var optionalService = animalServices.stream().filter(v -> v.targetAnimal() == animal).findAny();
        if (optionalService.isEmpty()) {
            throw new RuntimeException();
        }
        return optionalService.get();
    }
}
