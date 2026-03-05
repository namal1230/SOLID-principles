package org.example.bestPractice;

// Software entities should be open for extension but closed for modification.

/*
    You should be able to add new behavior
    Without modifying existing code
 */

public class Main {
    public static void main(String[] args) {
        CustomerInterface customer = new Customer();
        boolean user = customer.saveUserData();

        if(user){
            System.out.println("User Saved SuccessFully!");
        }else {
            System.out.println("User not Saved");
        }
    }
}