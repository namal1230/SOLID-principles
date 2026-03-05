package org.example.badPractice;

public class Main {
    public static void main(String[] args) {
        UserInterface user = new Customer();
        UserInterface employee = new Employee();

        user.saveUser();
        employee.customersBankDetails();
    }
}
