import java.util.Scanner;

public class javalab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        System.out.println("Enter the Rollnumber:");
        int rollNumber = sc.nextInt();
        System.out.println("Enter the Percentage:");
        double percentage = sc.nextDouble();
        System.out.println("Name:"+name);
        System.out.println("Rollnumber:"+rollNumber);
        System.out.println("Percentage:"+percentage);



    }
}
