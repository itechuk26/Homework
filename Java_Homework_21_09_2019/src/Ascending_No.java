/*
2. Write a program for ascending order of the number?

 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ascending_No {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("\n\t\t Java Program to Re-arrange Given Number in Ascending Order");
        System.out.print(" Enter Any Number : ");
        num = in.nextInt();
        Ascend(num);
    }

    public static void Ascend(int num){
        List<Integer> nos = new LinkedList<>();
        for(int i=num ; i>0 ; i /= 10)              // run the for loop till i>0 and every time do i/10
            nos.add(i%10);                        // add the last digit of Number to Linked List  nos

        nos.stream().sorted().forEach(System.out::print);     // sort the Linked-list and print it
    }
}
