
/*
Java Program to Reverse the String
Example :
Yellow
output : wolleY
 */

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;

        System.out.println("\n\tJava Program to reverse given String");
        System.out.print("Enter any Word : ");
        name  = in.next();
        in.close();

        System.out.println("Reverse is : " +rev_word(name));
    }

    public static String rev_word(String name){
        String  rev_name = "";
        char temp;

        for(int i=(name.length()-1); i>=0 ; i--){
            temp = name.charAt(i);
            rev_name = rev_name + temp;
        }
        return rev_name;
    }
}
