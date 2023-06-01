package java_week04_yagnik;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class LeftAngleTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int numberOfRows = sc.nextInt();
        int row, column;
        for (row=0; row<numberOfRows; row++)
        {
            for (column=2*(numberOfRows-row); column>2; column--)
            {
                System.out.print(" ");
            }
            for (column=0; column<=row; column++ )
            {
                System.out.print("* ");
            }
            //To move cursor to new line for each row
            System.out.println();
        }
    }
}
