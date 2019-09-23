import java.util.Scanner;
import java.util.Arrays;

public class Answer2 {
    public static void main(String[] args) {
        Answer2 ob = new Answer2();
        ob.MinAndMaxInputChallenge();
    }

    public void MinAndMaxInputChallenge() {
        Scanner in = new Scanner(System.in);
        int  i=0,j=0;
        int num[] = new int[10];


        while (j == 0) {
            System.out.print("\t .Enter Number . "+(i) +" : ");
            if (in.hasNextInt() && (i<10)) {
                num[i] = in.nextInt();
                i++;
            }
           else {
               in.close();
               Arrays.sort(num);
                System.out.printf("Modified arr[] : %s", Arrays.toString(num));
                System.out.println("\nMinimum Number is : " + num[0]);
                System.out.println("Maximum Number is " + num[(num.length-1)]);
                break;
            }
        }
    }
}

