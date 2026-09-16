abstract class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Basic Salary: $" + basicSalary);
    }

    abstract double calculateBonus();
}

class Developer extends Employee {
    Developer(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    double calculateBonus() {
        return basicSalary * 0.15;
    }
}

class Manager extends Employee {
    Manager(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    double calculateBonus() {
        return basicSalary * 0.25;
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Employee dev = new Developer(101, "Alex", 60000);
        dev.displayEmployee();
        System.out.println("Developer Bonus: $" + dev.calculateBonus());

        Employee mgr = new Manager(102, "Sophia", 85000);
        mgr.displayEmployee();
        System.out.println("Manager Bonus: $" + mgr.calculateBonus());
    }
}
