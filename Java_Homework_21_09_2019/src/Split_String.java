import java.util.Scanner;

/*
7. Write a program to split the string?
 */
public class Split_String {
    public static void main(String[] args) {
        System.out.println("Java Program to Split the Given String");
        Scanner in = new Scanner(System.in);
        String a;

        System.out.print("Enter any Setance : ");
        a=in.nextLine();
        String a_split[] = a.split("\\s");

        split(a_split);
    }

    public static void split(String a_split[]){
        for(int i=0; i<a_split.length; i++)
            System.out.println(a_split[i]);
    }
}
