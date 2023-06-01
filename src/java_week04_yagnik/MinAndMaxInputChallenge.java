package java_week04_yagnik;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1(sc);
    }

    public static void m1(Scanner sc) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number:");

            if (sc.hasNextInt()) {
                int number = sc.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
        }

        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);

        sc.close();
    }
}
