package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    private Feline feline;

    @Test
    public void getKittensWOParamsInvokeGetKittensWith1Test() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWParamReturnsSameValueTest() {
        Assert.assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.getFood("Хищник"));
    }
}
