package java_week04_yagnik;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        System.out.println("Fibonacci numbers are: ");
        for (int i = 0; i <= number; i++) {
            System.out.print(fib(i) + "  ");
        }
    }
}
