package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Vendor vendor;
    private List<Product> productList = new ArrayList<>();

    public Order(Vendor vendor) {
        this.vendor = vendor;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
