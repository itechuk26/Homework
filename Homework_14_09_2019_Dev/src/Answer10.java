import java.util.Scanner;

public class Answer10 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int num;

        System.out.println("\t\tJava Program to check given No is Armstrong or not ");
        System.out.print("Enter any No : ");
        num = in.nextInt();

        if(check_Armstrong(num))
            System.out.println(num +" is Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");

    }

    public static boolean check_Armstrong(int num){
        boolean ans=false;
        int temp = num;
        int rem,sum=0;

        for(int i=1; temp>0; i++){
            rem = temp%10;
            sum = sum + (rem*rem*rem);
            temp = temp/10;
        }
        if(sum==num)
            ans=true;

        return ans;
    }
}
