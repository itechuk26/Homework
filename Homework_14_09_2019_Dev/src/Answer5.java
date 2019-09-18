import java.util.Scanner;

public class Answer5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("\n\t Java Program to check given number is Palindrome or not");

        System.out.print("\t Enter Any Number : ");
        i = in.nextInt();

        System.out.println(isPalindrome(i));
    }

    public static boolean isPalindrome(int a){
        boolean ch = true;
        int reverse=0,rem;

        int temp = a;

        while(temp != 0){
            rem = temp % 10;
            reverse =  reverse * 10  + rem;
            temp = temp/10;
        }

        if(a == reverse){
            ch = true;
        }
        else{
            ch = false;
        }
        return ch;
    }
}
