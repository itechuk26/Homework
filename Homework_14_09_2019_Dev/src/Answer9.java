import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("\t\t Java Program to Print Fibonnanci Series ");
        System.out.print("\t\t Enter the Length of your Series : ");
        i = in.nextInt();

        fibo(i);
    }

    public static void fibo(int a) {
        int n1 = 1, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (int i = 2; n2 < a; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
