package com.assignment.ordersnotificationsmanagement.repository;

import com.assignment.ordersnotificationsmanagement.model.Product;
import com.assignment.ordersnotificationsmanagement.Database.INMemoryDB;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    INMemoryDB dataBase;
    public ProductRepository(INMemoryDB dataBase){
        this.dataBase = dataBase;
        dataBase.setProducts(generateDummyProducts());
    }

    public List<Product> getAllProducts(){
        return this.dataBase.getProducts();
    }

    private List <Product> generateDummyProducts() {
        List <Product> products = new ArrayList<>();
        Product prod1 = new Product(1, "SN123", "Product 1", "Vendor A", "Category A", 29.99, 100);
        Product prod2 = new Product(2, "SN124", "Product 2", "Vendor B", "Category B", 39.99, 150);
        Product prod3 = new Product(3, "SN125", "Product 3", "Vendor C", "Category C", 19.99, 80);
        Product prod4 = new Product(4, "SN126", "Product 4", "Vendor D", "Category D", 49.99, 120);
        Product prod5 = new Product(5, "SN127", "Product 5", "Vendor E", "Category A", 59.99, 200);
        Product prod6 = new Product(6, "SN128", "Product 6", "Vendor A", "Category B", 34.99, 90);
        Product prod7 = new Product(7, "SN129", "Product 7", "Vendor B", "Category C", 24.99, 180);
        Product prod8 = new Product(8, "SN130", "Product 8", "Vendor C", "Category D", 44.99, 70);
        Product prod9 = new Product(9, "SN131", "Product 9", "Vendor D", "Category A", 14.99, 110);
        Product prod10 = new Product(10, "SN132", "Product 10", "Vendor E", "Category B", 54.99, 160);
        Product prod11 = new Product(11, "SN133", "Product 11", "Vendor A", "Category C", 64.99, 130);
        Product prod12 = new Product(12, "SN134", "Product 12", "Vendor B", "Category D", 74.99, 50);
        Product prod13 = new Product(13, "SN135", "Product 13", "Vendor C", "Category A", 84.99, 140);
        Product prod14 = new Product(14, "SN136", "Product 14", "Vendor D", "Category B", 94.99, 190);
        Product prod15 = new Product(15, "SN137", "Product 15", "Vendor E", "Category C", 104.99, 60);
        Product prod16 = new Product(16, "SN138", "Product 16", "Vendor A", "Category D", 114.99, 150);
        Product prod17 = new Product(17, "SN139", "Product 17", "Vendor B", "Category A", 124.99, 220);
        Product prod18 = new Product(18, "SN140", "Product 18", "Vendor C", "Category B", 134.99, 80);
        Product prod19 = new Product(19, "SN141", "Product 19", "Vendor D", "Category C", 144.99, 100);
        Product prod20 = new Product(20, "SN142", "Product 20", "Vendor E", "Category D", 154.99, 120);
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(prod4);
        products.add(prod5);
        products.add(prod6);
        products.add(prod7);
        products.add(prod8);
        products.add(prod9);
        products.add(prod10);
        products.add(prod11);
        products.add(prod12);
        products.add(prod13);
        products.add(prod14);
        products.add(prod15);
        products.add(prod16);
        products.add(prod17);
        products.add(prod18);
        products.add(prod19);
        products.add(prod20);
        return products;
    }
}
