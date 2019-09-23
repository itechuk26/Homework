/*
11. Write a Java program to display Pascal's triangle.
Input number of rows: 5

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */
import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {


        int r, number = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        r = scan.nextInt();

        print_pascal(r);
    }

    public static void print_pascal(int r){
        for (int i = 0; i < r; i++) {
            for (int k = r; k > i; k--) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


