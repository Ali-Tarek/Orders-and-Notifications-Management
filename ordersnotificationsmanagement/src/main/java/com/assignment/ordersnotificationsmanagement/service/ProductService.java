package com.assignment.ordersnotificationsmanagement.service;

import com.assignment.ordersnotificationsmanagement.model.Product;
import com.assignment.ordersnotificationsmanagement.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product getProductById(int id) {
        List <Product> products = productRepository.getAllProducts();
        for(int i = 0; i < products.size(); i++)
            if(Objects.equals(products.get(i).getId(), id))
                return products.get(i);
        return null;
    }
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }


}
