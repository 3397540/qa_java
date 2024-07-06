package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParameterizedTests {

    List<String> expectedFood;
    String animalKind;

    public AnimalParameterizedTests(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] params() {
        List<List<String>> food = new ArrayList<>();
        food.add(0, List.of("Трава", "Различные растения"));
        food.add(1, List.of("Животные", "Птицы", "Рыба"));
        List<String> type = Arrays.asList("Травоядное", "Хищник");

        return new Object[][] {
                {type.get(0), food.get(0)},
                {type.get(1), food.get(1)}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(expectedFood, animal.getFood(animalKind));
    }
}

