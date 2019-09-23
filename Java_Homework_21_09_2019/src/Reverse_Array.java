/*
13. Write a Java program to reverse an array of integer values.
 */

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len;

        System.out.println(" Java program to Reverse elements of Array");
        System.out.print("Enter the length of the Array : ");
        len = in.nextInt();
        int a[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter Value for Array a[" + i + "] : ");
            a[i] = in.nextInt();
        }

        in.close();

        System.out.println("\n Reverse the Array using Simple logic");
        rev_simple(a);
    }

    public static void rev_simple(int a[]){
        int len = a.length;
        int j = len;
        int b[] = new int[len];

        for(int i=0; i<len; i++){
            b[j-1] = a[i];
            j -= 1;
        }
        System.out.println("Reserve Array is ");
        for(int i=0; i<len; i++)
            System.out.print(b[i] + " ");
    }

}