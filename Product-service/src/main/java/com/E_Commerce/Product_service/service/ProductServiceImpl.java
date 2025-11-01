package com.E_Commerce.Product_service.service;

import com.E_Commerce.Product_service.model.Product;
import com.E_Commerce.Product_service.repository.ProductRepo;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl  {

    private final ProductRepo productRepo;


    public Product createProduct(Product product) {
        return productRepo.save(product);
    }


    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


    public Product getProductById(Long id) {
        return productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product Not Found"));
    }
}
