
# 🧑‍💼 Java Payroll Management System

Welcome to the **Java Payroll Management System**, an elegant solution crafted with Object-Oriented Programming (OOP) principles to streamline your employee management process. This project is designed to efficiently handle both full-time and part-time employees, making it a versatile tool for any business.

## 🌟 Features

### 🔧 Abstract `Employee` Class
- **Blueprint for Employees:** The `Employee` class sets the foundation for all employee types, encapsulating essential attributes like `name` and `id`.
- **Abstract Salary Calculation:** By defining an abstract method `calculateSalary()`, we ensure that each employee type has its own unique way of calculating their salary.

### 💼 Full-Time Employees
- **Class: `FullTimeEmployee`**
- **Fixed Monthly Salary:** This class is tailored for full-time employees, where the salary is calculated on a monthly basis.
- **Straightforward Salary Calculation:** Simply returns the fixed monthly salary.

### ⏰ Part-Time Employees
- **Class: `PartTimeEmployee`**
- **Flexible Hourly Wage:** Designed for part-time employees, this class calculates salary based on hours worked and the hourly rate.
- **Dynamic Salary Calculation:** Implements a flexible formula: `hourWorked * hourlyRate`.

### 📊 Payroll System Management
- **Class: `PayrollSystem`**
- **Seamless Employee Management:** Manage your workforce with ease using an `ArrayList` to store employee data.
- **Add and Remove Employees:** Efficiently add new employees and remove existing ones by their ID.
- **Display Employee Data:** A comprehensive display of all employees, including their calculated salaries.

### 🚀 Main Program Execution
- **Class: `Manager`**
- **Interactive Example:** The `Manager` class brings the Payroll System to life, showcasing its capabilities by adding, removing, and displaying employee data.

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK):** Ensure you have JDK installed on your system.

### Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Varun453B/Employee_Payroll_Java.git
   cd Employee_Payroll_Java
   ```

2. **Compile the Code:**
   ```bash
   javac Manager.java
   ```

3. **Run the Program:**
   ```bash
   java Manager
   ```

### Example Output
```bash
DataBase:
Employee Details -->
Name = Varun
id = 101
Salary = 5000.0

Employee Details -->
Name = Bawa
id = 102
Salary = 450.0

Remove:
Total Employees:
Employee Details -->
Name = Varun
id = 101
Salary = 5000.0
```

## 🛠️ Customization

Feel free to extend this project by adding new types of employees, adjusting the salary calculation methods, or integrating more complex payroll functionalities.

## 📚 Learning Objectives

This project is not just a tool but also a learning experience, demonstrating key OOP concepts:
- **Abstraction:** Abstract classes and methods.
- **Inheritance:** Extending base classes.
- **Polymorphism:** Overriding methods.
- **Encapsulation:** Protecting and managing employee data.

## 👥 Contributing

Contributions are welcome! Whether you have ideas for new features, want to improve the code, or enhance the documentation, feel free to fork this repository and submit a pull request.

### How to Contribute

1. **Fork the Repository**
2. **Create a Feature Branch**
   ```bash
   git checkout -b feature/YourFeature
   ```
3. **Commit Your Changes**
   ```bash
   git commit -m 'Add YourFeature'
   ```
4. **Push to the Branch**
   ```bash
   git push origin feature/YourFeature
   ```
5. **Open a Pull Request**

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

---

**Thank you for visiting our project!** We hope this Payroll Management System will help you understand and implement the core principles of Object-Oriented Programming while providing a practical tool for managing employee data. If you have any questions or need further assistance, feel free to reach out!

---

Happy Coding! Bawaaaaa... ✨

---

