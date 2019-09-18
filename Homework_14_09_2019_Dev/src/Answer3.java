import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        check_vowel_or_constant();
    }

    public static void check_vowel_or_constant() {
        Scanner in = new Scanner(System.in);

        System.out.println("Java Program to check Given Character is Vowels or Constant ");
        System.out.print("Enter any Character : ");
        char ch = in.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
                System.out.println("Character is Vowel ");

            } else {
                System.out.println("Character is consonant ");
            }
        }
        else
        {
            System.out.println("Invalid Input ");

        }
    }
}
