package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
   private OrderRepository orderRepository;
   private InStockChecker inStockChecker;
   private InformationService informationService;

    public ProductOrderService(final OrderRepository orderRepository, final InStockChecker inStockChecker, final InformationService informationService) {
        this.orderRepository = orderRepository;
        this.inStockChecker = inStockChecker;
        this.informationService = informationService;
    }
    public OrderDto process(final OrderRequest orderRequest){
        if (inStockChecker.isInStock()) {
            informationService.informUser(orderRequest.getUser());
            orderRepository.storeData();
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            System.out.println("Problem with this order, product is out of stock.");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
