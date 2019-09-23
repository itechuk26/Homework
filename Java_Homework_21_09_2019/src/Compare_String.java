import java.util.Scanner;

/*
5. Write a program to compare two strings?
 */
public class Compare_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a,b;

        System.out.println("Java Program to compare to String ");
        System.out.print("Enter String 1 : ");
        a= in.next();
        System.out.print("Enter String 2 : ");
        b= in.next();

        System.out.println("Compare Using Java String.equals method");
        System.out.println("\t Comparing  "+a +" and " +b +" = " +com(a,b));

        System.out.println("\n Compare using own method");
        System.out.println("\t Comparing  "+a +" and " +b +" = " +mycom(a,b));
    }

    public static boolean com(String a, String b){
        boolean ans=false;
        if(a.equals(b))
            ans=true;
        return ans;
    }

    public static boolean mycom(String a, String b){
        boolean ans=false;

        if(a.length() == b.length()){
            for(int i=0; i<a.length()-1; i++){
                if(a.charAt(i)== b.charAt(i))
                    ans = true;
                else
                    break;
            }
        }
        return ans;
    }
}
