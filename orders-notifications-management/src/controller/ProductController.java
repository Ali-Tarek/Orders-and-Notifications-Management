//package com.assignment.ordersnotificationsmanagement.controller;
//
//import com.assignment.ordersnotificationsmanagement.model.Product;
//import com.assignment.ordersnotificationsmanagement.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/products")
//public class ProductController {
//    private final ProductService productService;
//
//    @Autowired
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Product>> getAllProducts() {
//        List<Product> products = productService.getAllProducts();
//        return ResponseEntity.ok(products);
//    }
//
//    @GetMapping("/{productId}")
//    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
//        return productService.getProductById(productId)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
//        Product createdProduct = productService.saveProduct(product);
//        return ResponseEntity.ok(createdProduct);
//    }
//
//    @PutMapping("/{productId}")
//    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody Product product) {
//        product.setId(productId);
//        Product updatedProduct = productService.saveProduct(product);
//        return ResponseEntity.ok(updatedProduct);
//    }
//
//    @DeleteMapping("/{productId}")
//    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
//        productService.deleteProduct(productId);
//        return ResponseEntity.noContent().build();
//    }
//}
