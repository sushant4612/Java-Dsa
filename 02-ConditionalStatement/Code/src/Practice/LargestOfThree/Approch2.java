package Practice.LargestOfThree;

import java.util.Scanner;

public class Approch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = 0;
        if (num1>max){
            max = num1;
        }else{
            max = num2;
        }
        if (num3>max){
            max = num3;
        }
        System.out.println("Maximum number is " + max);
    }
}
