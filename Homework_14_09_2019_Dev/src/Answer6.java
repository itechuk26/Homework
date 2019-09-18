import java.util.Scanner;

public class Answer6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Java Program to print triangle from given number ");
        System.out.print("How many raw you want in your triangle  ? : ");
        int a = in.nextInt();

        triangle(a);
    }

    public static void triangle(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
    }
}
