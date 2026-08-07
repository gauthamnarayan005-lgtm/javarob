import java.util.Scanner;
import java.util.Arrays;



public class maximumelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("enter the numbers for the index "+i+":");
            number[i] = sc.nextInt();
        }
        int max = number[0];
        for(int i=1;i<number.length;i++){
            if(max < number[i]){
                max=number[i];
            }
        }




        sc.close();
        System.out.println(Arrays.toString(number));
        //int max = Arrays.stream(number).max().getAsInt();
        System.out.println("largest value is : "+max);




    }
}
