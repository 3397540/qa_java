package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void getKittensWOParamsInvokeGetKittensWith1Test() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWParamReturnsSameValueTest() {
        Feline felineObj = new Feline();
        Assert.assertEquals(5, felineObj.getKittens(5));
    }

    @Test
    public void getFamilyTest() {
        Feline felineObj = new Feline();
        Assert.assertEquals("Кошачьи", felineObj.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline felineObj = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, felineObj.getFood("Хищник"));
    }
}
