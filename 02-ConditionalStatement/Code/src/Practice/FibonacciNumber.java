package Practice;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n ; i++) {
            int temp = b;
            b = a+b;
            a = temp;
        }
        System.out.println(b);
    }
}
