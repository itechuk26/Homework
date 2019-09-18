import java.util.Scanner;

public class Answer17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len;

        System.out.println("\t\t Java Program to find Average of Numeric Array ");
        System.out.print("\t Enter the Length of your array :");
        len = in.nextInt();

        AveOfArray(len);
    }

    public static void AveOfArray(int len){
        Scanner in = new Scanner(System.in);
        int sum=0;
        int[] num = new int[len - 1];

        for (int i = 0; i < len-1 ; i++) {
            System.out.print(" Enter No [" + +(i + 1) + "] : ");
            num[i] = in.nextInt();
            sum += num[i];
        }

        System.out.println("Average of the Array is : "+(sum/(len-1)));
        in.close();
    }
}