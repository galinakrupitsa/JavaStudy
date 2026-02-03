package org.example.ordersservice.Controller;

import org.example.ordersservice.DTO.DTOrequest;
import org.example.ordersservice.DTO.DTOresponse;
import org.example.ordersservice.Model.Orders;
import org.example.ordersservice.Service.OrdersService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.io.Serial;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
                order.getTotalCost(),
                order.getFirstName(),
                order.getSecondName(),
                order.getCreatedAt(),
                order.getQuantity()
        );
    }

    @GetMapping("/orders/total")
    public Double getTotal(
            @RequestParam String start,
            @RequestParam String end) {

        // Парсим строки в LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime startDate = LocalDateTime.parse(start, formatter);
        LocalDateTime endDate = LocalDateTime.parse(end, formatter);

        return ordersService.totalCostByTime(startDate, endDate);
    }

    @GetMapping("orders/product/{id}/daily-count")
    public Integer getDailyProductSales(
            @PathVariable("id") Long productId,
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        return ordersService.getProductSalesForDay(productId, date);
    }
}
