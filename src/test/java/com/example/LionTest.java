package com.example;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private final String sex = "Самец";

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Rule
    public ExpectedException
            expectedRule = ExpectedException.none();

    @Test
    public void throwExceptionTest() throws Exception {
        expectedRule.expect(Exception.class);
        expectedRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("Нечто", feline);
    }
}
