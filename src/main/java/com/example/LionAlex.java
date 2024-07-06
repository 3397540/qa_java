package com.example;

import java.util.ArrayList;
import java.util.List;

public class LionAlex extends Lion {

    private final Feline feline;

    public LionAlex(Feline feline) throws Exception {

        super("Самец", feline);
        this.feline = feline;
    }

    @Override
    public int getKittens() {

        return feline.getKittens(0);
    }

    public String getPlaceOfLiving() {

        return "Нью-Йоркский зоопарк";
    }

    public List<List<String>> getFriends() {

        List<List<String>> friends = new ArrayList<>();

        friends.add(List.of("Марти", "зебра"));
        friends.add(List.of("Глория", "бегемот"));
        friends.add(List.of("Мелман", "жираф"));

        return friends;
    }
}
