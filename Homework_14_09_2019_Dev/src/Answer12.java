import java.util.Scanner;

public class Answer12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        boolean con=true;
        System.out.println("\n \t Java Program to Check Prime No ");
        System.out.print("Enter any No : ");
        a = in.nextInt();

        con = check(a);
        if (con) {
            System.out.println(a + " is a prime no");
        } else
            System.out.println(a + " is not a prime no");

    }

    private static boolean check(int a) {
        boolean ans = true;
        int m;
        if ((a == 0) || (a == 1))
            ans = false;
        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0)
                    ans = false;
            }
        }
        return ans;
    }
}
