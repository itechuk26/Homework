import java.util.Scanner;

public class Answer8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Java Program to print triangle from given Symbol ");
        System.out.print("How many raw you want in your triangle  ? : ");
        int a = in.nextInt();
        System.out.print("Enter any Symbol : ");
        char ch = in.next().charAt(0);

        triangle(a,ch);
    }

    public static void triangle(int a, char ch) {
        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
        }
    }
}
