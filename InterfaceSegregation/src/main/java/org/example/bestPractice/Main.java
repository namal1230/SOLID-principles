package org.example.bestPractice;

// Clients should not be forced to depend on methods they do not use.


public class Main {
    public static void main(String[] args) {
        CustomerInterface user = new Customer();
        EmployeeInterface employee = new Employee();

        user.saveUser();
        employee.customersBankDetails();
    }
}
