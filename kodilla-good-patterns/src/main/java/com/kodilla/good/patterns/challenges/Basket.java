package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class Basket {
    ArrayList<Item> items;

    public Basket() {
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
