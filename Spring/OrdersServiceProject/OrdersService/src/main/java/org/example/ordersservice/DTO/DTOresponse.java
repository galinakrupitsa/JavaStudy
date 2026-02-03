package org.example.ordersservice.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DTOresponse {
    public Long userId;
    public Long productId;
    public Double totalCost;
    public String firstName;
    public String secondName;
    public LocalDateTime createdAt;
    public Integer quantity;

    public DTOresponse(Long id, Long userId, Long productId, Double totalCost, String firstName, String secondName, LocalDateTime createdAt, Integer quantity) {
        this.userId = userId;
        this.productId = productId;
        this.totalCost = totalCost;
        this.firstName = firstName;
        this.secondName = secondName;
        this.createdAt = createdAt;
        this.quantity = quantity;
    }
}
