package com.ecommerce.Product_service.controller;

import com.ecommerce.Product_service.dto.ProductDTO;
import com.ecommerce.Product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;



    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto) {
        return ResponseEntity.ok(productService.addProduct(dto));
    }

    // ProductController.java
    @PutMapping("/{id}/reduceStock")
    public ResponseEntity<ProductDTO> reduceStock(@PathVariable Long id, @RequestParam int quantity) {
        ProductDTO updatedProduct = productService.reduceStock(id, quantity);
        return ResponseEntity.ok(updatedProduct);
    }


    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
}
