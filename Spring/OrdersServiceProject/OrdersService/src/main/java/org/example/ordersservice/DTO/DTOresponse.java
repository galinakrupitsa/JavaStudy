package org.example.ordersservice.DTO;

import lombok.Data;

@Data
public class DTOresponse {
    public Long userId;
    public Long productId;
    public Double totalCost;
    public String firstName;
    public String secondName;

    public DTOresponse(Long id, Long userId, Long productId, Double totalCost, String firstName, String secondName) {
        this.userId = userId;
        this.productId = productId;
        this.totalCost = totalCost;
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
