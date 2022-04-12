package com.sjkim.animal;

import org.springframework.stereotype.Service;

@Service
public class DuckService extends AbstractAnimalService {
    @Override
    public String getName() {
        return "오리";
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public Animal targetAnimal() {
        return Animal.DUCK;
    }
}
