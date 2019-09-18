import java.util.Scanner;

public class Answer11 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int num;

        System.out.println("\t\tJava program For sum of Even digit in given Number");
        System.out.print("\t\t Enter Any Number : ");
        num =  in.nextInt();

        System.out.println(evenDititSum(num));

    }

    public static int evenDititSum(int num){
        if(num<0)
        {
            return -1;
        }
        int rem, sum=0;
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 == 0) {
                sum  = sum + rem;
            }
            num = num / 10;
        }
        return sum;
    }


}
