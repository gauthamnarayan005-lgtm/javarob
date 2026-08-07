import java.util.Scanner;


public class salarycalculator {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Salary:");
        int basicsalary = sc.nextInt();
        double DA = 0.1 * basicsalary;
        double HRA = 0.2 * basicsalary;
        double GrossSalary = basicsalary+DA+HRA;

        System.out.println("DA:"+DA+"\nHRA:"+HRA+"\nGross Salary:"+GrossSalary);




    }
}
