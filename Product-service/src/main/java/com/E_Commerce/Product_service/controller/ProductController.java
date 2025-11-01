package com.E_Commerce.Product_service.controller;

import com.E_Commerce.Product_service.model.Product;
import com.E_Commerce.Product_service.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;


    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @GetMapping
    public List<Product> getAllproduct() {
        return productRepo.findAll();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
        Product product = productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product Not Found "));
        return ResponseEntity.ok(product);
    }


}
