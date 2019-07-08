package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private Basket basket;

    public OrderRequest(User user, Basket basket) {
        this.user = user;
        this.basket = basket;
    }

    public User getUser() {
        return user;
    }

    public Basket getBasket() {
        return basket;
    }
}
