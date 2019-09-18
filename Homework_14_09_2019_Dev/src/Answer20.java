import java.util.Scanner;

public class Answer20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Java Program to print Triangle from given Symbol ");
        System.out.print("How many raw you want in your Triangle  ? : ");
        int n = in.nextInt();
        System.out.print("Which Symbol you want in your Shape ? : ");
        char ch = in.next().charAt(0);

        triangle(n, ch);
    }

    public static void triangle(int n, char ch) {
        int s = n - 1;
        System.out.print("A diamond with " + 2 * n + " rows is as follows:\n\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print(ch+" ");
            System.out.print("\n");
            s--;
        }

    }
}

