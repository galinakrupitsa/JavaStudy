package org.example.productservice.Service;

import org.example.productservice.Model.Product;
import org.example.productservice.Repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product getProduct(Long productId) {
        return productRepository.getProductsById(productId);

    }
}
