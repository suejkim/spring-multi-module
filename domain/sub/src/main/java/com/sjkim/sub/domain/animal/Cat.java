package com.sjkim.sub.domain.animal;

import com.sjkim.domain.animal.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public boolean act() {
        System.out.println("야옹");
        return true;
    }

    @Override
    public String applyName(String name) {
        return "고양이의 이름은 " + name;
    }
}
