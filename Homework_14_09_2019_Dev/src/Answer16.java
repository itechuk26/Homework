/*   16. Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -   */

import java.util.Scanner;

public class Answer16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lon;

        System.out.println("\n\t\t Java Program to Print to Draw Grid");
        System.out.print("\t How many Columns in Grid ? : ");
        lon = in.nextInt();

        grid(lon);
    }

    public static void grid(int len) {

        for (int i = 0; i < len; i++) {
            System.out.println();
            for (int j = 0; j < 21; j++)
                System.out.print("-");
        }
    }
}
