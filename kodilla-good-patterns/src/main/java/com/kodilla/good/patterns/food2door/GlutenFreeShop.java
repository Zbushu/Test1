package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Vendor {
    @Override
    public boolean process(Order order) {
        System.out.println("Do we need gluten?");
        int orderQuantity = order.getProductList().stream()
                .mapToInt(Product::getQuantity)
                .sum();
        if(orderQuantity >=3) {
            System.out.println("We need some gluten free food!");
            return true;
        } else {
            System.out.println("We like to eat gluten!");
            return false;
        }
    }
}
