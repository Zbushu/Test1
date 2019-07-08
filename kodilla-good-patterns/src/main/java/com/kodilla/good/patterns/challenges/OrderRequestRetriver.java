package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {
    public OrderRequest retrive(){
        User user = new User("John", "Smith");

        Basket basket = new Basket();

        Item item1 = new Item("Product", 1);
        Item item2 = new Item("Product2", 2);
        Item item3 = new Item("Product3", 1);

        basket.getItems().add(item1);
        basket.getItems().add(item2);
        basket.getItems().add(item3);

        return new OrderRequest(user,basket);
    }
}
