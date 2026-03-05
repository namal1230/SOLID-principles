package org.example.badPractice.user;

import static org.example.badPractice.product.Laptop.checkItemIsAvailable;

public class Customer {
    public static boolean saveRequest(){
        boolean isAvailable = checkItemIsAvailable();
        return isAvailable;
    }
}
