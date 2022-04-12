package com.sjkim.api.abstract_test;

import com.sjkim.animal.Animal;
import com.sjkim.animal.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController extends BaseAnimalController {

    public AnimalController(List<AnimalService> animalServices) {
        super(animalServices);
    }

    @GetMapping("/name")
    public String getName(@RequestParam Animal animal) {
        return getAnimalService(animal).getName();
    }

    @GetMapping("/common/name")
    public String getCommonName(@RequestParam Animal animal) {
        return getAnimalService(animal).getCommonName();
    }

    @GetMapping("/age")
    public String getAge(@RequestParam Animal animal) {
        return getAnimalService(animal).getAge() + "살입니다.";
    }

}
