package org.example;



//import static org.example.badPractice.user.Customer.saveRequest;

import org.example.bestPractice.product.LaptopImpl;
import org.example.bestPractice.user.Customer;

// High-level modules should not depend on low-level modules.
// Both should depend on abstractions.
// Abstractions should not depend on details.
// Details should depend on abstractions.

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(new LaptopImpl());
        boolean saveRequest = customer.saveRequest();
        System.out.println(saveRequest);
    }
}