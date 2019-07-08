package com.kodilla.good.patterns.food2door;

import javax.xml.soap.SOAPPart;

public class HealthyShop implements Vendor {
    @Override
    public boolean process(Order order) {
        System.out.println("Everyone like healthy food!");
        return true;
    }
}
