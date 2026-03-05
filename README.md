# SOLID Principles in Object-Oriented Programming

This project demonstrates the SOLID principles in object-oriented programming (OOP), which are foundational concepts for writing clean, maintainable, and scalable software.

## 👨‍💻 About SOLID

**SOLID** is an acronym for five design principles introduced by **Robert C. Martin** (Uncle Bob) to improve software architecture:

* **S** - Single Responsibility Principle (SRP)
* **O** - Open/Closed Principle (OCP)
* **L** - Liskov Substitution Principle (LSP)
* **I** - Interface Segregation Principle (ISP)
* **D** - Dependency Inversion Principle (DIP)

These principles help developers design systems that are easy to extend, test, and maintain.

---

## 1️⃣ Single Responsibility Principle (SRP)

> A class should have only one reason to change.

* Each class should handle a single responsibility.
* Example: Separate `Customer` and `Notification` classes instead of combining all logic in `Main`.

**Reference:** Robert C. Martin, *Clean Architecture*

---

## 2️⃣ Open/Closed Principle (OCP)

> Software entities should be open for extension but closed for modification.

* You should be able to add new behavior without modifying existing code.
* Example: Create different classes for `DatabaseCustomer`, `FileCustomer`, `CloudCustomer` implementing a common `CustomerInterface`.

**Reference:** Robert C. Martin, *Clean Architecture*

---

## 3️⃣ Liskov Substitution Principle (LSP)

> Subtypes must be substitutable for their base types without altering the correctness of the program.

* Any class implementing an interface should honor the expected behavior.
* Example: Avoid forcing `Employee` to implement `Customer` methods it does not need.

**Reference:** Barbara Liskov, *Data Abstraction and Hierarchy*

---

## 4️⃣ Interface Segregation Principle (ISP)

> Clients should not be forced to depend on methods they do not use.

* Break large interfaces into smaller, focused ones.
* Example: Separate `EmployeeInterface` and `CustomerInterface` instead of a single `UserInterface` with unrelated methods.

**Reference:** Robert C. Martin, *Clean Architecture*

---

## 5️⃣ Dependency Inversion Principle (DIP)

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

* Depend on interfaces or abstract classes rather than concrete implementations.
* Example: `Customer` depends on `Laptop` abstraction, injected via constructor instead of creating `LaptopImpl` directly.

**Reference:** Robert C. Martin, *Clean Architecture*

---

## 📖 Summary

Following SOLID principles ensures that software:

* Is easier to maintain and extend
* Reduces code duplication
* Supports testability
* Minimizes tight coupling

This project demonstrates these principles in Java with practical examples.

---

## 🙏 Acknowledgments

* **Robert C. Martin (Uncle Bob)** – for introducing SOLID principles and clean code concepts.
* **Barbara Liskov** – for the Liskov Substitution Principle, a fundamental concept in OOP.

---

## 🏷️ References

* [Clean Architecture by Robert C. Martin](https://www.oreilly.com/library/view/clean-architecture/9780134494272/)
* [Barbara Liskov – Data Abstraction and Hierarchy](https://dl.acm.org/doi/10.1145/362384.362389)


