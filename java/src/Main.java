import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total marks = " + total);
        System.out.println("Average mark = " + average);

        if (average > 50) {
            System.out.println("Student scored above 50 average");
        } else {
            System.out.println("Student did not score above 50 average");
        }

        sc.close();
    }
}