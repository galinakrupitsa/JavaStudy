package org.example.ordersservice.Service;

import lombok.RequiredArgsConstructor;
import org.example.ordersservice.Client.ProductClient;
import org.example.ordersservice.Model.Orders;
import org.example.ordersservice.Repository.OrdersRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class OrdersService {
    public final OrdersRepository ordersRepository;

    public final ProductClient productClient;
    public OrdersService(ProductClient productClient, OrdersRepository ordersRepository) {
        this.productClient = productClient;
        this.ordersRepository = ordersRepository;
    }
    public Orders createOrder(Long userId, Long productId, Integer quantity) {

        Double price = productClient.getProductPrice(productId);
        Double totalCost = price * quantity;

        Orders order = new Orders();
        order.setUserId(userId);
        order.setProductId(productId);
        order.setTotalCost(totalCost);

        return ordersRepository.save(order);
    }
}
