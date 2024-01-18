package com.assignment.ordersnotificationsmanagement.repository;

import com.assignment.ordersnotificationsmanagement.Database.INMemoryDB;
import com.assignment.ordersnotificationsmanagement.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    INMemoryDB dataBase;
    public CustomerRepository(INMemoryDB dataBase){
        this.dataBase = dataBase;
    }

    public List<Customer> getAllCustomers(){
        return this.dataBase.getCustomers();
    }

    public void createCustomer(Customer newCustomer){
        this.dataBase.addCustomer(newCustomer);
    }

    public int getNextId() {
        return this.dataBase.getCustomers().size();
    }

    public Customer getCustomerById(int customerId) {
        List<Customer> customers = getAllCustomers();
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getId() == customerId){
                return customers.get(i);
            }
        }
        return null;
    }
}