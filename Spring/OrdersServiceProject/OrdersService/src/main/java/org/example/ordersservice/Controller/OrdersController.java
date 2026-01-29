package org.example.ordersservice.Controller;

import org.example.ordersservice.DTO.DTOrequest;
import org.example.ordersservice.DTO.DTOresponse;
import org.example.ordersservice.Model.Orders;
import org.example.ordersservice.Service.OrdersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrdersController {
    public final OrdersService ordersService;
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
    @PostMapping("/orders")
    public DTOresponse createOrder(@RequestBody DTOrequest dto){
        Orders order = ordersService.createOrder(
                dto.getUserId(),
                dto.getProductId(),
                dto.getQuantity()
        );

        return new DTOresponse(
                order.getId(),
                order.getUserId(),
                order.getProductId(),
                order.getTotalCost()
        );
    }
}
