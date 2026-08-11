import java.util.Scanner;




public class arithmetic_operations {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while(keepRunning){
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.exit");
            System.out.println("enter number from 1 to 5 to select:");

            int choice = sc.nextInt();

            if (choice==1){
                System.out.println("enter the number to add:");
                int Firstnumber = sc.nextInt();
                System.out.println("enter the second number ");
                int Secondnumber = sc.nextInt();
                int sum = Firstnumber + Secondnumber;
                System.out.println("sum:"+sum);
            } else if (choice==2) {
                System.out.println("Enter the number to substract:");
                int Firstnumber = sc.nextInt();
                System.out.println("enter the second number:");
                int Secondnumber = sc.nextInt();
                int substracted = Firstnumber - Secondnumber;
                System.out.println("substracted:"+substracted);
            } else if (choice==3) {
                System.out.println("Enter the number to multiply:");
                int Firstnumber = sc.nextInt();
                System.out.println("enter the second number:");
                int Secondnumber = sc.nextInt();
                int multiply = Firstnumber * Secondnumber;
                System.out.println("multiplied:"+multiply);

            } else if (choice==4) {
                System.out.println("Enter the number to divide:");
                double Firstnumber = sc.nextInt();
                System.out.println("enter the second number:");
                double Secondnumber = sc.nextInt();
                double division = Firstnumber / Secondnumber;
                System.out.println("division:"+division);

            } else if (choice==5) {
                keepRunning = false;
                break;

            }
        }
            
        }

    }


