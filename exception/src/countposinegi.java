import java.util.Scanner;


import java.util.Arrays;



public class countposinegi {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int size = sc.nextInt();
        int[] number= new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("enter the number for the index" + 1 + ":");
            number[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(number));
        int positive = 0;
        int negative = 0;
        for(int i=0;i< number.length;i++ ) {
            if (number[i] < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        System.out.println("The positive numbers in the array:"+positive+"\nnegative numbers in array:"+negative);


    }
}
