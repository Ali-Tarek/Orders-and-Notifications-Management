package com.assignment.ordersnotificationsmanagement.controller;
import com.assignment.ordersnotificationsmanagement.model.Customer;
import com.assignment.ordersnotificationsmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createCustomer(@RequestBody Customer newCustomer) {
        return ResponseEntity.ok("Customer created with ID: " + customerService.createCustomer(newCustomer));
    }

    @GetMapping("")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCustomerById(@PathVariable("id") int id) {
        Customer customer = customerService.getCustomerById(id);
        if (customer == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer with ID " + id + " not found.");
        } else {
            return ResponseEntity.ok(customer);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> signIn(@RequestBody Customer customer){
        if(customerService.signIn(customer.getEmail(),customer.getPassword())){
            return ResponseEntity.ok("Logged in successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Wrong credentials");
    }


    @PatchMapping("/updateBalance")
    public ResponseEntity<String> updateBalance(@RequestBody Customer customer){
        if(customerService.updateBalance(customer)){
            return ResponseEntity.ok("balance updated successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Wrong id");
    }






}


