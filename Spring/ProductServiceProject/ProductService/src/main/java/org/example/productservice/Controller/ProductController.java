package org.example.productservice.Controller;

import org.example.productservice.DTO.ProductDTO;
import org.example.productservice.Model.Product;
import org.example.productservice.Service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    public final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping ("/products/{productId}")
    public Product getProduct(@PathVariable Long productId) {
        return productService.getProduct(productId);
    }

    @PostMapping ("/products")
    public Product addProducts(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}
