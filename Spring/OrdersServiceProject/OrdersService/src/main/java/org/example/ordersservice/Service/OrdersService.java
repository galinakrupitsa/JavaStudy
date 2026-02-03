package org.example.ordersservice.Service;

import lombok.RequiredArgsConstructor;
import org.example.ordersservice.Client.ProductClient;
import org.example.ordersservice.Client.UserClient;
import org.example.ordersservice.Model.Orders;
import org.example.ordersservice.Repository.OrdersRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service

public class OrdersService {
    public final OrdersRepository ordersRepository;
    public final UserClient userClient;
    public final ProductClient productClient;
    public OrdersService(ProductClient productClient, OrdersRepository ordersRepository, UserClient userClient) {
        this.productClient = productClient;
        this.ordersRepository = ordersRepository;
        this.userClient = userClient;
    }

    public Orders createOrder(Long userId, Long productId, Integer quantity) {

        Double price = productClient.getProductPrice(productId);
        Double totalCost = price * quantity;
        String firstName = userClient.getUserName(userId);
        String secondName = userClient.getUserSecondName(userId);

        Orders order = new Orders();
        order.setUserId(userId);
        order.setProductId(productId);
        order.setTotalCost(totalCost);
        order.setFirstName(firstName);
        order.setSecondName(secondName);
        order.setCreatedAt(LocalDateTime.now());
        order.setQuantity(quantity);

        return ordersRepository.save(order);
    }

    public Double totalCostByTime(LocalDateTime start, LocalDateTime end){
        return ordersRepository.getTotalCostBetween(start,end);
    }

    public Integer getProductSalesForDay(Long productId, LocalDate date) {

        LocalDateTime start = date.atStartOfDay();
        LocalDateTime end = date.atTime(23, 59, 59);

        return ordersRepository.sumQuantityByProductAndDate(productId, start, end);
    }
}
