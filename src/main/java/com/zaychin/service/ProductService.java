package com.zaychin.service;

import com.zaychin.entity.Product;
import com.zaychin.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ProductService(ProductRepository productRepository) {

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }
}
