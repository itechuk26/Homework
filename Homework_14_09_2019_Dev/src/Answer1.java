import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        System.out.println("Git hub Practice");
        System.out.println("Java Program to print sum of 10 numbers entered by user");
        System.out.println("Sum = " +ReadingUserInputChallenge());
    }

    private static int ReadingUserInputChallenge(){
        Scanner in = new Scanner(System.in);
        int a[], sum=0, i=0;
        a = new int[10];

        while(i<10){

            System.out.print("Enter number #"+(i+1) +" : ");

            if(in.hasNextInt()){
                a[i] = in.nextInt();
                sum = sum + a[i];
                i++;
            }
            else{
                System.out.println("Invalid Numbers");
                in.next();
            }
        }
        in.close();
        return sum;
    }
}
