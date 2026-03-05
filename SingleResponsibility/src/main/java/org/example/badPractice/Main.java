package org.example.badPractice;

public class Main {
    public static void main(String[] args){
        String database = databaseConnection();
        showNotifications("User Authentication Success");
    }

    public static String databaseConnection(){
        // implement database connection code
        return "database instance";
    }

    public static void showNotifications(String message){
        System.out.println(message);
    }
}
