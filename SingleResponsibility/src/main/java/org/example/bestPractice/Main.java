package org.example.bestPractice;

import static org.example.bestPractice.DatabaseConnection.databaseConnection;
import static org.example.bestPractice.NotificationHandle.showNotifications;

public class Main {
    public static void main(String[] args){
        String database = databaseConnection();
        showNotifications("User Authentication Success");
    }
}
