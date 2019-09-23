/*
8. Write a Java program to display the following character rhombus structure.
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
ABCDEFEDCBA
ABCDEFGFEDCBA
ABCDEFEDCBA
ABCDEDCBA
ABCDCBA
ABCBA
ABA
A

*/
import java.util.Scanner;

public class Rombous_Char {
    public static void main(String[] args) {
        System.out.println("\tJava program to display the following character rhombus structure.  ");

        Scanner in = new Scanner(System.in);
        int len;
        System.out.print("Enter the length of your rombus Structure : ");
        len = in.nextInt();

        rombus(len);

    }

    public static void rombus(int len) {

        for (int i = 0; i <= len; i++)     // Printing First Half of the Diamond
        {
            int alphabet = 65;
            for (int j = len; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + k));
            }
            for (int l = i - 1; l >= 0; l--)
            {
                System.out.print((char) (alphabet + l));
            }
            System.out.println();
        }

        for (int i = len; i>=0; i--)            // Printing Second Half of Diamond
        {
            int alphabet = 65;
            for (int j = len; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + k));
            }
            for (int l = i - 1; l >= 0; l--)
            {
                System.out.print((char) (alphabet + l));
            }
            System.out.println();
        }



    }
}


