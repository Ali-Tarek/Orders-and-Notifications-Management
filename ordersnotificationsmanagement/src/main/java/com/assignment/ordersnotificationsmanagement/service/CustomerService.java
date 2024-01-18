package com.assignment.ordersnotificationsmanagement.service;

import com.assignment.ordersnotificationsmanagement.model.Customer;
import com.assignment.ordersnotificationsmanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    private int currentCustomerID;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
        this.currentCustomerID = -1;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    public Customer getCustomerById(int id) {
        List <Customer> customers = customerRepository.getAllCustomers();
        for(int i = 0; i < customers.size(); i++)
            if(Objects.equals(customers.get(i).getId(), id))
                return customers.get(i);
        return null;
    }
    public int createCustomer(Customer newCustomer) {
        newCustomer.setId(customerRepository.getNextId());
        customerRepository.createCustomer(newCustomer);
        return newCustomer.getId();
    }

    public boolean signIn(String email, String password){
        List <Customer> customers = customerRepository.getAllCustomers();
        for(int i = 0; i < customers.size(); i++)
            if(Objects.equals(customers.get(i).getEmail(), email) && Objects.equals(customers.get(i).getPassword(), password)) {
                currentCustomerID = i;
                return true;
            }
        return false;
    }


    public boolean updateBalance(Customer customer) {
        List <Customer> customers = customerRepository.getAllCustomers();
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getId() == customer.getId()) {
                customers.get(i).setBalance(customer.getBalance());
                return true;
            }
        }
        return false;
    }
}
