package java_week04_yagnik;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        // Check if the number is negative.
        if (number < 0){
            return -1;
        }
        // Initialize the sum of even digits.
        int sum = 0;

        // Iterate over the digits of the number.
        while (number > 0) {
            // Get the last digit of the number.
            int digit = number % 10;

            // If the digit is even, add it to the sum.
            if (digit % 2 == 0) {
                sum += digit;
            }

            // Remove the last digit from the number.
            number /= 10;
        }

        // Return the sum of even digits.
        return sum;
    }

    public static void main(String[] args) {
        // Call the getEvenDigitSum method and print the result.
        System.out.println(getEvenDigitSum(123456789)); // 20
        System.out.println(getEvenDigitSum(252)); // 4
        System.out.println(getEvenDigitSum(-22)); // -1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        System.out.println(getEvenDigitSum(number));
    }
}
