package org.example.ordersservice.DTO;

import lombok.Data;

@Data
public class DTOrequest {
    Long productId;
    Long userId;
    Integer quantity;

}
