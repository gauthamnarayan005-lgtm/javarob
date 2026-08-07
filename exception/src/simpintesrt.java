import java.util.Scanner;

public class simpintesrt {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the priciple:");
        int principle = sc.nextInt();
        System.out.println("Enter the Rate:");
        int rate = sc.nextInt();
        System.out.println("Enter the Time:");
        int time = sc.nextInt();

        int SI = (principle*rate*time)/100;
        int total = SI + principle;

        System.out.println("Simple Interest:"+SI);
        System.out.println("Total Amount:"+total);






    }
}
