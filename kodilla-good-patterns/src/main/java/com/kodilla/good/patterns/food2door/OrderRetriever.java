package com.kodilla.good.patterns.food2door;

public class OrderRetriever {
    public Order retrieve() {
        Product product1 = new Product("Product1", 1);
        Product product2 = new Product("Product2",  1);
        Product product3 = new Product("Product3", 2);

        Vendor vendor = new ExtraFoodVendor();

        Order order = new Order(vendor);

        order.getProductList().add(product1);
        order.getProductList().add(product2);
        order.getProductList().add(product3);

        return order;
    }
}
