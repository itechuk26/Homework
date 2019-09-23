/*
20. Write a Java program to reverse elements in a array list.

using Java Inheritance Concepts

 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Reverse_Elements extends ArrayList_Retrive_Element {  // Make ArrayList_Retrive a Parent Class
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len,ret;

        System.out.print("How many Employees you got in your company ? : ");
        len = in.nextInt();

        ArrayList<String> emp = new ArrayList<>(len);
        add(emp,len);                         // Calling method add(emp,len) form   Parent Class

        System.out.println("\n Employees List in Reverse ");
        System.out.println(reverse(emp));        //  Calling method reverse(emp) from  Parent Class

        in.close();
    }
}
