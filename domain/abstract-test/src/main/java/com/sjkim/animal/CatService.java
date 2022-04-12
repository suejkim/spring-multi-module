package com.sjkim.animal;

import org.springframework.stereotype.Service;

@Service
public class CatService extends AbstractAnimalService implements AnimalService {
    @Override
    public String getName() {
        return "고양이";
    }

    @Override
    public int getAge() {
        return 2;
    }

    @Override
    public String getCommonName() {
        return "Animal";
    }

    @Override
    public Animal targetAnimal() {
        return Animal.CAT;
    }
}
