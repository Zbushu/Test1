package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    public static void process(Order order) {
        if (order.getVendor().process(order)){
            System.out.println("Order processed");
        } else {
            System.out.println("Order process has failed");
        }
    }
}
