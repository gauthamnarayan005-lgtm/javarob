import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "sample_data.txt";
        String content = "Java File Handling: Writing and Reading Data.";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Data successfully written to " + fileName);

            FileReader reader = new FileReader(fileName);
            System.out.print("Reading content: ");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
