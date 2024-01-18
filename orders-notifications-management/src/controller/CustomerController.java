//package com.assignment.ordersnotificationsmanagement.controller;
//
//import com.assignment.ordersnotificationsmanagement.model.Customer;
//import com.assignment.ordersnotificationsmanagement.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/customers")
//public class CustomerController {
//    private final CustomerService customerService;
//
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Customer>> getAllCustomers() {
//        List<Customer> customers = customerService.getAllCustomers();
//        return ResponseEntity.ok(customers);
//    }
//
//    @GetMapping("/{customerId}")
//    public ResponseEntity<Customer> getCustomerById(@PathVariable Long customerId) {
//        return customerService.getCustomerById(customerId)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
//        Customer createdCustomer = customerService.saveCustomer(customer);
//        return ResponseEntity.ok(createdCustomer);
//    }
//
//    @PutMapping("/{customerId}")
//    public ResponseEntity<Customer> updateCustomer(@PathVariable Long customerId, @RequestBody Customer customer) {
//        customer.setId(customerId);
//        Customer updatedCustomer = customerService.saveCustomer(customer);
//        return ResponseEntity.ok(updatedCustomer);
//    }
//
//    @DeleteMapping("/{customerId}")
//    public ResponseEntity<Void> deleteCustomer(@PathVariable Long customerId) {
//        customerService.deleteCustomer(customerId);
//        return ResponseEntity.noContent().build();
//    }
//}