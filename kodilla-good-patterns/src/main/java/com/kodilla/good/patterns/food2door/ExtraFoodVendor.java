package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class ExtraFoodVendor implements Vendor {

    @Override
    public boolean process(Order order) {
        System.out.println("Lets throw a coin...");
        Random random = new Random();

        return random.nextBoolean();
    }
}
