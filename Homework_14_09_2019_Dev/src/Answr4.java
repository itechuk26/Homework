import java.util.Scanner;

public class Answr4 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Java Program for Sum of Digits for given Number");
        System.out.print("Enter any Number : ");
        a =  in.nextInt();


        if(sumof_digits(a)== -1){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(sumof_digits(a));
        }

    }

    public static int sumof_digits(int a){
        int sum = 0, rem;

        if(a>9){
            while(a>0){
                rem = a%10;
                sum = sum + rem;
                a = a/10;
            }
        }
        else{
            sum=-1;
        }
            return sum;
        }
}
