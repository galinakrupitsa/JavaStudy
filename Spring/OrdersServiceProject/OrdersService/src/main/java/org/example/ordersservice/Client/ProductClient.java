package org.example.ordersservice.Client;

import org.example.ordersservice.DTO.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClient {

    private final RestTemplate restTemplate;

    public ProductClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Double getProductPrice(Long productId) {
        String url = "http://localhost:8082/api/v1/products/" + productId;
        ProductDTO product = restTemplate.getForObject(url, ProductDTO.class);
        return product.getPrice();
    }
}