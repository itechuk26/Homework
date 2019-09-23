/*
12. Write a Java program to display the number rhombus structure. Go to the editor
Input the number: 7 Expected Output :
        1
       212
      32123
     4321234
    543212345
   65432123456
  7654321234567
   65432123456
    543212345
     4321234
      32123
       212
        1
 */
import java.util.Scanner;
public class Number_Rombus {

    public static void main(String[] args) {
        System.out.println("\tJava program to display the following character rhombus structure.  ");

        Scanner in = new Scanner(System.in);
        int len;
        System.out.print("Enter the length of your rombus Structure : ");
        len = in.nextInt();

        rombus(len);

    }

    public static void rombus(int len) {

        for(int i=1; i<=len; i++){    //print upper part
            for(int j=1; j<=len-i; j++){
                System.out.print(" ");//print space
            }
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            for(int l=2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();//move to next line
        }
        for(int i=len-1; i>=1; i--){  //print lower part
            for(int j=0; j<=len-1-i; j++){
                System.out.print(" ");//print space
            }
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            for(int l=2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();//move to next line
        }

    }
}
