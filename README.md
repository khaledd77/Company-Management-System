# Company Management System

A Java-based console application designed to manage employees, departments, project assignments, and promotions within an organization. This system applies core object-oriented programming (OOP) principles such as abstraction, inheritance, polymorphism, and encapsulation to simulate real-world company operations.

---

## Overview

This system allows HR or administrative users to:
- Add new employees to the organization
- Manage multiple departments and track their members
- Assign projects to eligible employees
- Promote employees by title and compensation
- Generate employee-related statistics

The program runs in a loop, offering a text-based menu that guides the user through all operations.

---

## Key Features

### 1. Employee Management
Supports creation and management of the following employee types:
- **Manager**
- **Developer**
- **Intern**
- **Hourly Developer**

Each type has its own attributes and behavior defined through class inheritance and interface implementation.

### 2. Department Handling
- Automatically creates departments when new employees are added.
- Associates employees with their respective departments.
- Stores base salary and maintains a list of employees per department.

### 3. Project Assignment
- Projects can be assigned to eligible employees (e.g., Developers).
- Tracks assigned projects and allows multiple assignments.

### 4. Promotions
- Developers and other promotable roles can receive title upgrades and salary bonuses.
- Promotion logic is encapsulated via the `Promote` interface.

### 5. Reporting & Statistics
- View  departments all employees.


---

## Technologies Used

- **Java SE** (Standard Edition)
- **Collections API**: `HashMap`, `ArrayList`
- **OOP Principles**: Inheritance, Polymorphism, Abstraction, Interfaces
- **Dynamic Type Checking**: `instanceof`

---

## Project Structure

```
src/
│
├── App.java                // Entry point and UI logic
├── Employee.java           // Abstract base class
├── Manager.java            // Inherits Employee
├── Developer.java          // Inherits Employee, implements AssignProjects, Promote
├── Intern.java             // Inherits Employee
├── HourlyDeveloper.java    // Inherits Employee
├── Department.java         // Stores department data and employee list
├── Promote.java            // Interface for promotion logic
└── AssignProjects.java     // Interface for project assignment
```

---


## Possible Extensions

- GUI implementation using JavaFX or Swing
- File-based persistence (e.g., saving employee data to files)
- Integration with a database (e.g., JDBC with MySQL)
- Role-based access control and authentication

---

## Author

**Khaled Ghareeb**  
Computer Science Student  
Object-Oriented Programming – Final Project, 2025
