package org.example.bestPractice;
/* Objects of a superclass (or interface) should be replaceable
  with objects of its subclasses without breaking the program. */


public class Main {
    public static void main(String[] args) {
        CustomerInterface user = new Customer();
        EmployeeInterface employee = new Employee();

        user.saveUser();
        employee.customersBankDetails();
    }
}
