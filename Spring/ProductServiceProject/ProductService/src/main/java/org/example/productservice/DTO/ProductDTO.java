package org.example.productservice.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    private Long productId;
    private String productName;
    private Long price;
}
