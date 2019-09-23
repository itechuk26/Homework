import java.util.ArrayList;
import java.util.Scanner;

/*
21. Write a Java program to empty an array list
 */
public class Empty_Array_List extends ArrayList_Retrive_Element{          //  Making parent class

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len;

        System.out.print("How many Employees you got in your company ? : ");
        len = in.nextInt();

        ArrayList<String> emp = new ArrayList<>(len);
        add(emp,len);                      // Calling method add AND empty_list  from  Parent class ArrayList_Retrive_Element

        System.out.println("\nEmpty the Array list using ArrayList.clear() Method");
        empty_list(emp);

        System.out.println("Now Size of Employee List is  : "+emp.size());
    }
}
