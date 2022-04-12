package com.sjkim.animal;

import org.springframework.stereotype.Service;

@Service
public class DogService extends AbstractAnimalService implements AnimalService {
    @Override
    public String getName() {
        return "강아지";
    }

    @Override
    public int getAge() {
        return 3;
    }

    @Override
    public Animal targetAnimal() {
        return Animal.DOG;
    }
}
