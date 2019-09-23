/* 1. Write a program to reverse the given number?
Exaple : 123
output : 321     */

import java.util.Scanner;

public class Reverse_No {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Java Program to Reverse Given Number");
        System.out.print("Enter Any  No : ");
        num = in.nextInt();
        System.out.println(reverse(num));


    }

    public static int reverse(int num){
        int rev = 0,rem;
        while(num>0){

            rev = rev * 10;
            rev = rev + num % 10;
            num = num/10;

        }
        return rev;
    }
}

