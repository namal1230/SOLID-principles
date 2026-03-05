package org.example.badPractice;

public class Customer {
    public static String saveUserData(){
        boolean saveUser = true;
        if(saveUser){
            return "User Saved SuccessFully!";
        }else {
            return "User not Saved";
        }
    }
}
