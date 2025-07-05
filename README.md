# Java Assignments – Semester 2

This repository contains all the Java assignments completed during Semester 2 of my Computer Science program. Each assignment simulates real-world scenarios using Core Java concepts such as object-oriented programming, inheritance, interfaces, exception handling, collections, and data structures.

---
### 1️) MyDate Class
- **Concepts**: Class, Object Creation, Constructor
- **Description**:  
  A simple class to manage and display dates. The program creates five date objects and prints them.
  It demonstrates how to define a class with attributes and use a parameterized constructor.
  The class contains:
  - Constructor to initialize `day`, `month`, and `year`
  - Method to display the date in `DD-MM-YYYY` format

---

### 2️) Word and Character Counter
- **Concepts**: String Manipulation, User Input
- **Description**:  
  A Java program that counts the number of words and characters (excluding spaces) in a user-provided sentence.
  The program includes:
  - Method to count words using string splitting
  - Method to count characters excluding spaces
  - A main method that accepts user input and displays the counts

---

### 3️) Circle Comparison
- **Concepts**: Parameterized Constructor, Object Comparison
- **Description**:  
  A program to create two Circle objects, calculate their area and perimeter, and compare them to find which one is larger.
  The class includes:
  - Constructor to set radius
  - Method to calculate area
  - Method to calculate perimeter
  - Method to compare two circles and print which is larger

---

### 4️) Traffic Light Simulation
- **Concepts**: Parameterized Constructor, State Change
- **Description**:  
  Simulates a real-life traffic light with states like Red, Yellow, and Green. The user can manually change colors.
  The program includes:
  - Constructor to initialize signal color and duration
  - Method to change the color of the traffic light
  - Method to display current signal state

---

### 5️) Complex Number Arithmetic
- **Concepts**: Polymorphism, Pass-by-Reference
- **Description**:  
  A class to handle arithmetic operations on complex numbers using object references.
  It supports:
  - Addition, subtraction, and multiplication of two complex numbers
  - Constructor to initialize real and imaginary parts
  - Method to display the result

---

### 6️) Student Result Database
- **Concepts**: Array of Objects, ArrayList, Grade Calculation
- **Description**:  
  Creates a student database where details like marks are entered, grades are calculated, and best performers are listed.
  The program allows:
  - Adding student details
  - Calculating total and percentage
  - Assigning grades
  - Displaying students who meet 'best student' criteria

---

### 7️) Library Management System
- **Concepts**: ArrayList, CRUD Operations
- **Description**:  
  Simulates a Library system using an ArrayList of books. It allows users to:
  - Add a book
  - Display all books
  - Search for a book by title or ID
  - Issue (mark unavailable)
  - Return (mark available)  
  This assignment practices data management and user interaction through a menu-driven program.

---

### 8️) Sports Inheritance Program
- **Concepts**: Inheritance, Method Overriding
- **Description**:  
  Demonstrates the use of inheritance by creating a base class `Sports` and subclasses like `Cricket`, `Football`, and `Tennis`.
  Each subclass overrides the `play()` method to define sport-specific behavior.
  The program:
  - Calls the play method polymorphically
  - Displays messages like "Playing Cricket", "Playing Football", etc.

---

### 9️) Employee Database System
- **Concepts**: Inheritance, Salary Computation
- **Description**:  
  A program that manages employee records and performs salary-related calculations.
  Features include:
  - Add and display employee details
  - Search employee by ID
  - Calculate total salary and take-home salary after deductions
  - Use of base and derived classes to handle different employee types

---

### 1️0) Shape Interface Program
- **Concepts**: Interface, Abstraction, Implementation
- **Description**:  
  A program that defines a `Shape` interface with a `getArea()` method. Multiple classes implement this interface:
  - `Circle`: Calculates area using πr²
  - `Rectangle`: Calculates area using length × breadth
  - `Triangle`: Calculates area using 0.5 × base × height

---

### 1️1️) A. Simple Calculator
- **Concepts**: Exception Handling, Switch Case
- **Description**:  
  A menu-driven calculator that performs basic arithmetic operations (+, -, *, /, %) and handles exceptions.
  The program:
  - Accepts two numbers and an operator
  - Performs the calculation
  - Catches exceptions like divide-by-zero and displays error messages

---

### 1️1️) B. Custom Exception for Odd Number
- **Concepts**: Custom Exception, Exception Throwing
- **Description**:  
  Demonstrates user-defined exception handling. If an odd number is passed to a method, a custom exception is thrown.
  The program includes:
  - Custom exception class (e.g., `OddNumberException`)
  - Method that checks if a number is even, throws exception if not
  - Try-catch block to handle and display the custom exception
