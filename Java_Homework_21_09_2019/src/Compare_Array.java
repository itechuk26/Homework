/*
3. Write a program to compare two array and its elements are same or not?
 */

import java.util.Scanner;

public class Compare_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];

        System.out.println("Java Program to compare elements in two Array");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number Array a[" + i + "] : ");
            a[i] = in.nextInt();
            System.out.print("Enter Number Array b[" + i + "] : ");
            b[i] = in.nextInt();
        }

        if(com(a,b))
            System.out.println("Array A and B has same elements ");
        else
            System.out.println("Array A and B Has not have same elements");
    }

    public static boolean com(int a[], int b[]) {
        boolean ans=false;
        for (int i = 0; i < 5; i++) {
            if (a[i] == b[i])
                ans = true;
            else
                break;
        }
        return ans;
    }
}




