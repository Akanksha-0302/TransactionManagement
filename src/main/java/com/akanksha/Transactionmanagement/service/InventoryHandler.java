package com.akanksha.Transactionmanagement.service;

import com.akanksha.Transactionmanagement.repo.ProductRepository;
import entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryHandler {
    private final ProductRepository productRepository;

    public Product updateInventory(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(int id) {
          System.out.println("here is changes from git");
        Product product=productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
        return product;
    }
}
