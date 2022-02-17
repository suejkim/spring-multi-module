package com.sjkim.api.main;

import com.sjkim.domain.animal.Animal;
import com.sjkim.domain.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Main {
    private final Animal animal;
    private final AnimalService animalService;

    public boolean execute() {
        animalService.actAnimal(animal);
        System.out.println(animalService.getAnimalName(animal));
        return true;
    }
}
