package com.example;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        alex.getKittens();
        Mockito.verify(feline, Mockito.times(0)).getKittens();
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        List<List<String>> expected = new ArrayList<>();

        expected.add(List.of("Марти", "зебра"));
        expected.add(List.of("Глория", "бегемот"));
        expected.add(List.of("Мелман", "жираф"));

        Assert.assertEquals(expected, alex.getFriends());
    }
}
