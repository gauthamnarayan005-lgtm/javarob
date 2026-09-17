import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class StudentRecord {
    int id;
    String name;
    double marks;

    StudentRecord(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    String toCSV() {
        return id + "," + name + "," + marks;
    }

    static StudentRecord fromCSV(String line) {
        String[] parts = line.split(",");
        return new StudentRecord(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]));
    }
}

public class StudentRecordManager {
    static void addStudent(String filePath, StudentRecord student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(student.toCSV());
            writer.newLine();
            System.out.println("Student " + student.name + " saved.");
        } catch (IOException e) {
            System.out.println("Save Error: " + e.getMessage());
        }
    }

    static void findStudent(String filePath, int searchId) {
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StudentRecord s = StudentRecord.fromCSV(line);
                if (s.id == searchId) {
                    System.out.println("Found: ID=" + s.id + ", Name=" + s.name + ", Marks=" + s.marks);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with ID " + searchId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String dbFile = "students.csv";
        new File(dbFile).delete();

        addStudent(dbFile, new StudentRecord(101, "Alice Smith", 91.5));
        addStudent(dbFile, new StudentRecord(102, "Bob Johnson", 84.0));
        addStudent(dbFile, new StudentRecord(103, "Charlie Brown", 78.2));

        System.out.println();
        findStudent(dbFile, 102);
        findStudent(dbFile, 105);
    }
}
