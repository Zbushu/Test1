package com.kodilla.good.patterns.challenges;

public class Processor {
    public static void main(String[]args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new OrderDataCollector(), new InStockCheckerGenerator(), new SMSSerwice());
        productOrderService.process(orderRequest);
    }
}
