/*
17. Write a Java program to create a new array list, add some colours (string) and
printout the collection.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Colour_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len;

        System.out.println("Java program to create a new array list, add some colours (string) and\n" +
                "printout the collection.");
        System.out.print("Enter the Length of your Array List : ");
        len=in.nextInt();

        ArrayList <String> color = new ArrayList<>(len);
        add_color(color,len);

        in.close();
    }

    public static void add_color(ArrayList<String> color, int len){

        Scanner in = new Scanner(System.in);

        for(int i=0; i<len; i++){
            System.out.print(" Enter color "+i +" : ");
            color.add(i, in.next());
        }

        System.out.println("\nList of Colours in your list is ");
        for(String name : color)
            System.out.println(name);

        in.close();
    }
}
