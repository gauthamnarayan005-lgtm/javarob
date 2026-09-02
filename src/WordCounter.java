import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WordCounter{
    public static void main(String[] args){
        String inputFile="sample.txt";
        String outputFile="wordCount.txt";

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));
            writer.write("java is simple to learn.");
            writer.newLine();
            writer.write("Practice makes programing better");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            int count = 0 ;
            String line;
            while((line = reader.readLine())!=null){
                line = line.trim();
                if(!line.isEmpty()){
                    String[] word = line.split("\\s+");
                    count += word.length;


                }
            }
            reader.close();
            BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
            out.write("Total words = "+ count);
            out.close();
            System.out.println("Word count written to "+outputFile);

        } catch (Exception e) {
            System.out.println("file error" + e.getMessage());
        }
    }
}
