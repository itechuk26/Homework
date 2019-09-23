/*
24. Write a Java program to generate random integers in a specific range.
 */

import java.util.Scanner;

public class Random_Number_Range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max,min;

        System.out.println("Java Program to Generate Random No from specific Range");
        System.out.print("Enter your Range Start No : ");
        min=in.nextInt();
        System.out.print("Enter Your Range Finish No : ");
        max = in.nextInt();

        System.out.println("\nRandom No between "+min +" and "+max +" = "+getRandom_from_range(min,max));
        in.close();
    }

    public static double getRandom_from_range(int min,int max){
        double random = (int)(Math.random() * ((max-min)+1)+min);

        return random;
    }
}
