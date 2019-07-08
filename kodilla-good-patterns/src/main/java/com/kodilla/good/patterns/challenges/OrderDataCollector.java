package com.kodilla.good.patterns.challenges;

public class OrderDataCollector implements OrderRepository {
    @Override
    public void storeData() {
        System.out.println("Saving data in file.");
    }
}
