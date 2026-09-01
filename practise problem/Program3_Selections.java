/**
* PROGRAM 3: Grade Calculator with Selections
* Topics: if-else, if-else-if, switch, string comparison
*/
import java.util.Scanner;

public class Program3_Selections {
    public static void determineGrade() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // 1. if-else statements
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0-100.");
        } else {
            // 2. if-else-if ladder
            String grade;
            String message;

            if (marks >= 90) {
                grade = "A+";
                message = "Excellent! Outstanding performance!";
            } else if (marks >= 80) {
                grade = "A";
                message = "Very Good! Keep it up!";
            } else if (marks >= 70) {
                grade = "B+";
                message = "Good! You can do better!";
            } else if (marks >= 60) {
                grade = "B";
                message = "Satisfactory. Need more effort!";
            } else if (marks >= 50) {
                grade = "C+";
                message = "Average. Work harder!";
            } else if (marks >= 40) {
                grade = "C";
                message = "Below average. Need improvement!";
            } else {
                grade = "F";
                message = "Failed. Please work much harder!";
            }

            // 3. Nested if-else
            String recommendation = "";
            if (marks >= 60) {
                if (marks >= 80) {
                    recommendation = "Consider choosing Computer Science.";
                } else {
                    recommendation = "Consider choosing Engineering.";
                }
            } else {
                if (marks >= 40) {
                    recommendation = "Consider diploma courses.";
                } else {
                    recommendation = "Consider skill development courses.";
                }
            }

            // 4. Switch statement (for grade to description)
            String gradeDescription;
            switch (grade) {
                case "A+":
                    gradeDescription = "Outstanding";
                    break;
                case "A":
                    gradeDescription = "Excellent";
                    break;
                case "B+":
                    gradeDescription = "Very Good";
                    break;
                case "B":
                    gradeDescription = "Good";
                    break;
                case "C+":
                    gradeDescription = "Satisfactory";
                    break;
                case "C":
                    gradeDescription = "Needs Improvement";
                    break;
                default:
                    gradeDescription = "Needs Special Attention";
            }

            // 5. String comparison
            System.out.println("\n--- Student Results ---");
            System.out.println("Student: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade + " (" + gradeDescription + ")");
            System.out.println("Message: " + message);
            System.out.println("Recommendation: " + recommendation);

            // 6. Logical operators (&&, ||, !)
            boolean isPassing = marks >= 40;
            boolean isDistinction = marks >= 75;
            boolean isScholarshipEligible = marks >= 80 && marks <= 100;
            boolean isSpecialCase = marks == 39 || marks == 40;

            System.out.println("\n--- Additional Information ---");
            System.out.println("Passing: " + isPassing);
            System.out.println("Distinction: " + isDistinction);
            System.out.println("Scholarship Eligible: " + isScholarshipEligible);
            System.out.println("Near Passing Case: " + isSpecialCase);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        determineGrade();
    }
}
