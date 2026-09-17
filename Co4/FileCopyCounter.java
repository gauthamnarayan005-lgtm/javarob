import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCounter {
    static void copyAndCount(String sourceFile, String destFile) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String src = "input_text.txt";
        String dest = "output_copy.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(src))) {
            writer.write("Java programming language is robust.\nIt provides powerful file handling APIs.\nException handling ensures safety.");
        } catch (IOException e) {
            System.out.println("Initial write failed: " + e.getMessage());
        }

        copyAndCount(src, dest);
    }
}
