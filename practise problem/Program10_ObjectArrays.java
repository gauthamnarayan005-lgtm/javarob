/**
* PROGRAM 10: Arrays of Objects & Object Passing
* Topics: Array of objects, Passing objects, Scope
*/
import java.util.Scanner;

class Employee {
    // Instance variables
    private int id;
    private String name;
    private double salary;
    private String department;

    // Static variable
    private static int employeeCount = 0;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        employeeCount++;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    // Setter with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Methods
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
            System.out.println(name + " received " + percentage + "% raise");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: $" + salary + " | Dept: " + department);
    }

    // Static method
    public static int getEmployeeCount() {
        return employeeCount;
    }
}

public class Program10_ObjectArrays {
    // Method to find highest paid employee
    public static Employee findHighestPaid(Employee[] employees) {
        Employee highest = employees[0];
        for (Employee emp : employees) {
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }
        return highest;
    }

    // Method to calculate average salary
    public static double calculateAverageSalary(Employee[] employees) {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        return total / employees.length;
    }

    // Method to display all employees in a department
    public static void displayDepartmentEmployees(Employee[] employees, String department) {
        System.out.println("\nEmployees in " + department + " Department:");
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getDepartment().equalsIgnoreCase(department)) {
                emp.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees in " + department + " department.");
        }
    }

    // Method demonstrating passing object and modifying
    public static void updateEmployeeSalary(Employee emp, double newSalary) {
        // Scope: emp is a local variable referencing the same object
        System.out.println("\nUpdating salary for " + emp.getName());
        emp.setSalary(newSalary);
        System.out.println("New salary set to: $" + emp.getSalary());
    }

    // Method demonstrating primitive vs object passing
    public static void demonstratePassing(int num, Employee emp) {
        // Primitive: num is passed by value
        num = 100; // This doesn't affect original
        // Object: emp is passed by reference
        emp.setSalary(5000); // This affects original object
        System.out.println("Inside method - num: " + num);
        System.out.println("Inside method - employee salary: " + emp.getSalary());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Creating an array of objects
        System.out.println("--- Creating Employee Array ---");
        Employee[] employees = new Employee[5];

        // 2. Initializing array with objects
        employees[0] = new Employee(101, "Amir Ali", 45000.0, "IT");
        employees[1] = new Employee(102, "Sara Khan", 38000.0, "HR");
        employees[2] = new Employee(103, "Ahmed Hassan", 42000.0, "IT");
        employees[3] = new Employee(104, "Fatima Noor", 50000.0, "Finance");
        employees[4] = new Employee(105, "Ali Raza", 36000.0, "HR");

        // 3. Display all employees using for-each loop
        System.out.println("\n--- All Employees ---");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        // 4. Finding highest paid employee
        System.out.println("\n--- Highest Paid Employee ---");
        Employee highest = findHighestPaid(employees);
        highest.displayInfo();

        // 5. Calculating average salary
        System.out.println("\n--- Average Salary ---");
        double avg = calculateAverageSalary(employees);
        System.out.println("Average Salary: $" + String.format("%.2f", avg));

        // 6. Displaying employees by department
        displayDepartmentEmployees(employees, "IT");
        displayDepartmentEmployees(employees, "Finance");

        // 7. Passing object to method
        System.out.println("\n--- Passing Object to Method ---");
        System.out.println("Before update:");
        employees[0].displayInfo();
        updateEmployeeSalary(employees[0], 50000);
        System.out.println("After update:");
        employees[0].displayInfo();

        // 8. Demonstrating scope and passing
        System.out.println("\n--- Scope and Passing Demo ---");
        int number = 25;
        System.out.println("Before method call - number: " + number);
        System.out.println("Before method call - emp[0] salary: " + employees[0].getSalary());
        demonstratePassing(number, employees[0]);
        System.out.println("After method call - number: " + number); // Still 25
        System.out.println("After method call - emp[0] salary: " + employees[0].getSalary()); // Changed to 5000

        // 9. Adding new employees dynamically
        System.out.println("\n--- Adding New Employee ---");
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter department: ");
        String dept = scanner.nextLine();

        // Create new employee
        Employee newEmployee = new Employee(106, name, salary, dept);
        System.out.println("New Employee Created:");
        newEmployee.displayInfo();

        // 10. Static variable example
        System.out.println("\n--- Statistics ---");
        System.out.println("Total employees: " + Employee.getEmployeeCount());

        scanner.close();
    }
}
