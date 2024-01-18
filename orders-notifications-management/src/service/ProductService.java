//package com.assignment.ordersnotificationsmanagement.service;
//
//import com.assignment.ordersnotificationsmanagement.model.Product;
//import com.assignment.ordersnotificationsmanagement.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//@Service
//public class ProductService {
//    private final ProductRepository productRepository;
//
//    @Autowired
//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    public Optional<Product> getProductById(Long productId) {
//        return productRepository.findById(productId);
//    }
//
//    public Product saveProduct(Product product) {
//        return productRepository.save(product);
//    }
//
//    public void deleteProduct(Long productId) {
//        productRepository.deleteById(productId);
//    }
//}