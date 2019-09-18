import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("\t Java Program to Sum of First and Last Digit Given by user ");
        System.out.print("Enter any Number : ");
        a = in.nextInt();

        System.out.println(sumFirstAndLastDigit(a));
    }

    public static int sumFirstAndLastDigit(int a){

        int num = a;
        if(num < 0){
            return -1;
        }
        int lastDigit = num % 10;

        while(num >= 10){
            num = num / 10;
        }
        int firstDigit = num ;
        return firstDigit + lastDigit;
    }
}


