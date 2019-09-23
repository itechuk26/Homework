/*
14. Write a Java method to check whether a string is a valid password

Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Expected Output:
1. A password must have at least eight characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits

Input a password
(You are agreeing to the above Terms and Conditions.): abcd1234
Password is valid: abcd1234
 */

import java.util.Scanner;

public class Password_Rules {

    public static final int min_password_len = 8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password;

        System.out.println("Java Program to check Given Password is Valid or not");
        System.out.print("1. A password must have at least eight characters. \n" +
                "2. A password consists of only letters and digits. \n" +
                "3. A password must contain at least two digits \n" +
                "\n" +
                "Input a password\n" +
                "(You are agreeing to the above Terms and Conditions.) : ");
        password = in.next();

        if (check(password))
            System.out.println("Password is Valid : " + password);
        else
            System.out.println("Password is invalid : "+password);
    }

    public static boolean check(String password) {

        int digit = 0, letter = 0;
        int i = 0;

        if (password.length() < min_password_len)
            return false;

        while (i < password.length()) {
            if ((password.charAt(i) >= '0') && (password.charAt(i) <= '9'))
                digit = digit + 1;
            if (((password.charAt(i) >= 'a' && (password.charAt(i) <= 'z')) || ((password.charAt(i) >= 'A') && (password.charAt(i) <= 'Z'))))
                letter = letter + 1;

            i++;
        }

        return ((digit >= 2) && (letter >= 2));
    }
}

