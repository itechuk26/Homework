/*
9. Write a Java program to add two matrices of the same size.
 */

import java.util.Scanner;

public class Add_Matrix {
    public static void main(String[] args) {
        System.out.println("\n\n\t Write a Java program to add two matrices of the same size. ");

        Scanner in = new Scanner(System.in);
        int r, c;

        System.out.print(" Enter Rows and Columns of Matrix : ");
        r = in.nextInt();
        c = in.nextInt();


        int a[][] = new int[r][c];
        int b[][] = new int[r][c];

        System.out.println("\n\tEnter the elements of First Matrix");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the value for a[" + i + "][" + j + "] : ");
                a[i][j] = in.nextInt();
            }

        System.out.println("\n\tEnter the elements of Second Matrix");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the value for b[" + i + "][" + j + "] : ");
                b[i][j] = in.nextInt();
            }

        sum(r,c,a,b);
    }

    public static void sum(int r, int c, int a[][], int b[][]) {
        int sum[][] = new int[r][c];

        System.out.println("\n\t Sum of Matrix A and B ");
        for (int i = 0; i < r; i++)   {               // For loop for Adding elements of Matrix A and B
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.println(" Sum of a["+i+"]["+j+"]  + b["+i+"]["+j+"] = " +sum[i][j]);
            }
        }
    }
}
