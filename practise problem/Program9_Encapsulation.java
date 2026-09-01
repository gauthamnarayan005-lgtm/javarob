/**
* PROGRAM 9: Enhanced Student Class
* Topics: Static, Encapsulation, this reference, Access modifiers
*/
class EnhancedStudent {
    // 1. Instance variables (private for encapsulation)
    private String name;
    private int age;
    private double marks;
    private String grade;

    // 2. Static variable (shared across all objects)
    private static String collegeName = "Java University";
    private static int totalStudents = 0;
    private static int totalPassCount = 0;

    // 3. Constants
    public static final double PASSING_MARKS = 40.0;
    private static final double MAX_MARKS = 100.0;

    // 4. Constructor using this reference
    public EnhancedStudent(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.calculateGrade();
        totalStudents++;
        if (this.marks >= PASSING_MARKS) {
            totalPassCount++;
        }
        System.out.println("Student " + name + " registered successfully!");
    }

    // 5. Private method (encapsulation)
    private void calculateGrade() {
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B+";
        else if (marks >= 60) grade = "B";
        else if (marks >= 50) grade = "C+";
        else if (marks >= PASSING_MARKS) grade = "C";
        else grade = "F";
    }

    // 6. Getter methods (accessor)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    // 7. Setter methods (mutator) with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= MAX_MARKS) {
            this.marks = marks;
            this.calculateGrade();
            System.out.println("Marks updated for " + this.name);
        } else {
            System.out.println("Invalid marks! Must be between 0-100");
        }
    }

    // 8. Static method
    public static void displayCollegeInfo() {
        System.out.println("College: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Pass Count: " + totalPassCount);
        double passPercentage = (totalStudents > 0) ? (double)totalPassCount / totalStudents * 100 : 0;
        System.out.println("Pass Percentage: " + String.format("%.2f", passPercentage) + "%");
    }

    // 9. Static method to change college name
    public static void setCollegeName(String name) {
        collegeName = name;
    }

    // 9b. Static getter method (added so we can read totalStudents from outside the class)
    public static int getTotalStudents() {
        return totalStudents;
    }

    // 10. Instance method with this reference
    public void compareWith(EnhancedStudent other) {
        System.out.println("\nComparing " + this.name + " with " + other.name);
        if (this.marks > other.marks) {
            System.out.println(this.name + " has higher marks");
        } else if (this.marks < other.marks) {
            System.out.println(other.name + " has higher marks");
        } else {
            System.out.println("Both have same marks");
        }
    }

    // 11. Display method
    public void displayInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks + "/" + MAX_MARKS);
        System.out.println("Grade: " + this.grade);
        System.out.println("Status: " + (this.marks >= PASSING_MARKS ? "Pass" : "Fail"));
        System.out.println("College: " + collegeName);
    }
}

public class Program9_Encapsulation {
    public static void demonstrateEncapsulation() {
        // 1. Creating objects
        EnhancedStudent student1 = new EnhancedStudent("Ahmed", 20, 85.0);
        EnhancedStudent student2 = new EnhancedStudent("Sara", 22, 65.0);
        EnhancedStudent student3 = new EnhancedStudent("Ali", 19, 35.0);

        // 2. Using getters to access private data
        System.out.println("\n--- Accessing Private Data via Getters ---");
        System.out.println("Student1: " + student1.getName() + " - " + student1.getGrade());
        System.out.println("Student2: " + student2.getName() + " - " + student2.getGrade());
        System.out.println("Student3: " + student3.getName() + " - " + student3.getGrade());

        // 3. Using setters to modify private data with validation
        System.out.println("\n--- Updating Student Data ---");
        student1.setMarks(95.0);
        student1.setAge(21);
        student1.setName("Ahmed Khan");

        // Try invalid values
        student1.setMarks(-10); // Invalid
        student1.setAge(200); // Invalid
        student1.setName(""); // Invalid

        // 4. Static method call
        System.out.println("\n--- Static Method Demo ---");
        EnhancedStudent.displayCollegeInfo();

        // 5. Modifying static variable
        EnhancedStudent.setCollegeName("Tech University");
        System.out.println("\n--- After College Name Change ---");
        EnhancedStudent.displayCollegeInfo();

        // 6. Using this reference in method
        System.out.println("\n--- Comparing Students ---");
        student1.compareWith(student2);
        student2.compareWith(student3);

        // 7. Display all students
        System.out.println("\n--- All Students Details ---");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        // 8. Accessing static constant
        System.out.println("\n--- Constants Demo ---");
        System.out.println("Passing Marks: " + EnhancedStudent.PASSING_MARKS);
        System.out.println("Total Student Objects Created: " + EnhancedStudent.getTotalStudents());
    }

    public static void main(String[] args) {
        demonstrateEncapsulation();
    }
}
