/**
* PROGRAM 8: Student Class (Classes and Objects)
* Topics: Class definition, Constructors, Objects, Reference variables
*/
// 1. Defining a Class
class Student {
    // 2. Instance Variables (Data Fields)
    String name;
    int age;
    double marks;
    String grade;

    // 3. No-arg Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.marks = 0.0;
        this.grade = "Not Assigned";
        System.out.println("Default student created!");
    }

    // 4. Parameterized Constructor
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        calculateGrade();
        System.out.println("Student " + name + " created!");
    }

    // 5. Method to calculate grade
    public void calculateGrade() {
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B+";
        else if (marks >= 60) grade = "B";
        else if (marks >= 50) grade = "C+";
        else if (marks >= 40) grade = "C";
        else grade = "F";
    }

    // 6. Display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + (marks >= 40 ? "Pass" : "Fail"));
    }

    // 7. Method to update marks
    public void updateMarks(double newMarks) {
        this.marks = newMarks;
        calculateGrade();
        System.out.println("Marks updated for " + name);
    }

    // 8. Method with return
    public boolean isPassing() {
        return marks >= 40;
    }
}

public class Program8_ClassesAndObjects {
    public static void demonstrateClasses() {
        // 1. Creating Objects using constructors
        Student student1 = new Student(); // Using default constructor
        Student student2 = new Student("Amir Ali", 22, 85.5); // Using parameterized constructor

        // 2. Accessing objects via reference variables
        // Accessing instance variables
        student1.name = "John Doe";
        student1.age = 20;
        student1.marks = 75.0;
        student1.calculateGrade();

        // 3. Method calls
        System.out.println("\n--- Student 1 Details ---");
        student1.displayInfo();
        System.out.println("\n--- Student 2 Details ---");
        student2.displayInfo();

        // 4. Modifying object state
        System.out.println("\nUpdating marks for student2...");
        student2.updateMarks(92.0);
        student2.displayInfo();

        // 5. Using return value
        System.out.println("\nIs Student 2 passing? " + student2.isPassing());

        // 6. Multiple objects
        Student student3 = new Student("Alice", 19, 45.0);
        Student student4 = new Student("Bob", 21, 35.0);

        System.out.println("\n--- All Students ---");
        System.out.println("Student 1: " + student1.name + " - " + student1.grade);
        System.out.println("Student 2: " + student2.name + " - " + student2.grade);
        System.out.println("Student 3: " + student3.name + " - " + student3.grade);
        System.out.println("Student 4: " + student4.name + " - " + student4.grade);

        // 7. Null reference
        Student student5 = null;
        if (student5 == null) {
            System.out.println("\nstudent5 is null (no object created)");
        }
    }

    public static void main(String[] args) {
        demonstrateClasses();
    }
}
