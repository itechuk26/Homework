/*
18. Write a Java program to iterate through all elements in a array list.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Iterate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len;

        System.out.println("How many Employees you got in your company ? : ");
        len = in.nextInt();

        ArrayList <String> emp = new ArrayList<>(len);

        iterate(emp,len);
    }

    public static void iterate(ArrayList <String> emp, int len){
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the Names of your Staff ");
        for(int i=0; i<len; i++){
            System.out.print("Employee "+(i+1) +" : ");
            emp.add(i,in.next());
        }

        System.out.println("\nIterate All the elements in the List");
        for(String i:emp)
            System.out.println(i);
    }
}
