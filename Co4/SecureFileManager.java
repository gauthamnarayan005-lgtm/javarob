import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class EmptyFileException extends Exception {
    EmptyFileException(String message) {
        super(message);
    }
}

class InvalidFileFormatException extends Exception {
    InvalidFileFormatException(String message) {
        super(message);
    }
}

public class SecureFileManager {
    static void readSecureFile(String filePath) throws FileNotFoundException, EmptyFileException, InvalidFileFormatException, IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found at path: " + filePath);
        }

        if (file.length() == 0) {
            throw new EmptyFileException("File " + filePath + " is empty.");
        }

        if (!filePath.endsWith(".txt") && !filePath.endsWith(".log")) {
            throw new InvalidFileFormatException("Unsupported format. Only .txt and .log are permitted.");
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Contents of " + filePath + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        } finally {
            if (reader != null) {
                reader.close();
                System.out.println("File stream safely closed in finally block.");
            }
        }
    }

    public static void main(String[] args) {
        String validFile = "valid_log.txt";
        String emptyFile = "empty_log.txt";
        String invalidFormat = "data.pdf";
        String nonExistent = "missing.txt";

        try (FileWriter writer = new FileWriter(validFile)) {
            writer.write("Application initialized successfully.\nProcess PID: 4022 running.");
        } catch (IOException e) {
            System.out.println("Setup error: " + e.getMessage());
        }

        try (FileWriter writer = new FileWriter(emptyFile)) {
        } catch (IOException e) {
            System.out.println("Setup error: " + e.getMessage());
        }

        String[] testFiles = {validFile, emptyFile, invalidFormat, nonExistent};

        for (String f : testFiles) {
            System.out.println("--- Testing: " + f + " ---");
            try {
                readSecureFile(f);
            } catch (FileNotFoundException e) {
                System.out.println("Caught FileNotFoundException: " + e.getMessage());
            } catch (EmptyFileException e) {
                System.out.println("Caught EmptyFileException: " + e.getMessage());
            } catch (InvalidFileFormatException e) {
                System.out.println("Caught InvalidFileFormatException: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Caught IOException: " + e.getMessage());
            }
            System.out.println();
        }

        new File(validFile).delete();
        new File(emptyFile).delete();
    }
}
