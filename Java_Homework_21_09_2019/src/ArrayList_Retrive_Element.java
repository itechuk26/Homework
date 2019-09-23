import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Retrive_Element {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len,ret;

        System.out.println("How many Employees you got in your company ? : ");
        len = in.nextInt();

        ArrayList<String> emp = new ArrayList<>(len);
        add(emp,len);

        System.out.print("\n Enter an Element (as a Specified Index) for Retrieve : ");
        ret = in.nextInt();
        System.out.println(retrieve(emp,ret));

        in.close();
    }

    public static String retrieve(ArrayList<String> emp,int ret){
        String name = emp.get(ret);

        return name;
    }

    public static void add(ArrayList<String> emp, int len){
        System.out.println("\n Enter the names of people in your Company");
        for(int i=0; i<len; i++){
            System.out.print("Employee "+(i+1 +" : "));
            emp.add(i,in.next());
        }
    }

    public static ArrayList<String>reverse (ArrayList<String> emp){
        ArrayList <String> rev = new ArrayList<>(emp.size());

        for(int i=emp.size()-1; i>=0 ; i-- ){
            rev.add(emp.get(i));
        }
        return rev;
    }

    public static ArrayList<String> empty_list(ArrayList<String> emp){
        emp.clear();

        return emp;
    }
}
