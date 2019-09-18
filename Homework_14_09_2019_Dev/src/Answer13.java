import java.util.Scanner;

public class Answer13 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n1,n2;
        System.out.println("\t\t Java Program to find Shared digit from given Two Numbers between (10 -- 99) ");
        System.out.print("Enter First Number : ");
        n1 =  in.nextInt();
        System.out.print("Enter Second Number : ");
        n2 = in.nextInt();
        System.out.println(hasSharedDigit(n1,n2));
    }

    public static boolean hasSharedDigit(int n1, int n2){
        if((n1>=10 && n1<=99) && (n2>=10 && n2<=99))
        {
            int lefta = n1 / 10;
            int righta = n1 % 10;
            int leftb = n2 / 10;
            int rightb = n2 % 10;
            return (lefta == leftb || lefta == rightb || righta == leftb || righta == rightb);
        }
        return false;
    }
}
