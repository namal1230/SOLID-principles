package org.example.bestPractice;

import static org.example.bestPractice.DatabaseConnection.databaseConnection;
import static org.example.bestPractice.NotificationHandle.showNotifications;

// A class should have only one reason to change.

/*
    That means:
        One class → One responsibility
        If multiple responsibilities exist → It violates SRP
*/
public class Main {
    public static void main(String[] args){
        String database = databaseConnection();
        showNotifications("User Authentication Success");
    }
}
