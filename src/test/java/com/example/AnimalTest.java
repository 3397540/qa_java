package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, " +
                "медвежьи, куньи", animal.getFamily());
    }

    @Rule
    public ExpectedException
            expectedRule = ExpectedException.none();

    @Test
    public void getFoodThrowsExceptionTest() throws Exception {
        Animal animal = new Animal();
        expectedRule.expect(Exception.class);
        expectedRule.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        animal.getFood("Насекомоядное");
    }
}
