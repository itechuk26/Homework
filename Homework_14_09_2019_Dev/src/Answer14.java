import java.util.Arrays;
import java.util.Scanner;

public class Answer14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len;

        System.out.println("\t\t Java Program to Sort a Numeric and String Array ");
        System.out.print("\t Enter the Length of your array :");
        len = in.nextInt();

        int[] num = new int[len - 1];
        String[] str = new String[len - 1];


        for (int i = 0; i < len-1; i++) {
            System.out.print(" Enter No [" + +(i+1) + "]");
            num[i] = in.nextInt();
        }

        for (int j = 0; j < len-1; j++) {
            System.out.print(" Enter String [" + (j+1) + "]");
            str[j] = in.next();
        }

        System.out.println("Actual Number Array : " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted Number : " + Arrays.toString(num));
        System.out.println("Actual String Array : " + Arrays.toString(str));
        Arrays.sort(str);
        System.out.print("Sorted String : " + Arrays.toString(str));

        //sort(int[] num, String str[]);
    }

//    public static void sort(int[] num, String[] str) {
//        System.out.println("Actual Number Array : " + Arrays.toString(num));
//        Arrays.sort(num);
//        System.out.println("Sorted Number : " + Arrays.toString(num));
//        System.out.println("Actual String Array : " + Arrays.toString(str));
//        Arrays.sort(str);
//        System.out.print("Sorted String : " + Arrays.toString(str));
//    }
}

