package com.sjkim.animal;

import org.springframework.stereotype.Service;

@Service
public abstract class AbstractAnimalService implements AnimalService {
    @Override
    public String getCommonName() {
        return "동물";
    }
}
