import java.util.Scanner;

public class Answer18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len,value;

        System.out.println("\t\t Java Program to Find Specific Value in the Numeric Array ");
        System.out.print("\t Enter the Length of your array :");
        len = in.nextInt();
        System.out.print("\t Enter the Number to find from the Array :");
        value = in.nextInt();

        if(AveOfArray(len,value)){
            System.out.println("You Already Entered the Number " +value );
        }else
            System.out.println("You has not Entered the Number "+value);

    }

    public static boolean AveOfArray(int len,int value){
        Scanner in = new Scanner(System.in);
        int[] num = new int[len - 1];
        boolean find=false;

        for (int i = 0; i < len-1 ; i++) {
            System.out.print(" Enter No [" + +(i + 1) + "] : ");
            num[i] = in.nextInt();
            if(num[i]==value)
                find=true;
        }

        in.close();
        return find;
    }
}