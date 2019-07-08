package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class InStockCheckerGenerator implements InStockChecker {
    @Override
    public boolean isInStock() {
        System.out.println("Checking product quantity...");
        Random random = new Random();
        return random.nextBoolean();
    }
}
