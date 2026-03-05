package org.example.bestPractice.user;

import org.example.bestPractice.product.Laptop;

public class Customer {

    private Laptop laptop;

    public Customer(Laptop laptop) {
        this.laptop = laptop;
    }


    public boolean saveRequest(){
        return laptop.checkItemIsAvailable();
    }
}
