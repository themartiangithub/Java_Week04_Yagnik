package java_week04_yagnik;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        // Check if the numbers are within the range of 10-99.
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        // Convert the numbers to strings.
        String number1String = String.valueOf(number1);
        String number2String = String.valueOf(number2);

        // Check if the strings have any common characters.
        for (char c : number1String.toCharArray()) {
            if (number2String.contains(Character.toString(c))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Check if the numbers have any shared digits.
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2 : ");
        int number2 = sc.nextInt();
        System.out.println(hasSharedDigit(number1, number2));
    }
}
