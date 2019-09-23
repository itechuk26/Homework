import java.util.Scanner;

/*
10. Write a Java program to remove a specific element from an array.
 */
public class Array_Delete_Element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len,pos;

        System.out.println(" Java program to remove a specific element from an array.");
        System.out.print("Enter the length of the Array : ");
        len = in.nextInt();
        int a[] = new int[len];

        for(int i=0; i<len;i++){
            System.out.print("Enter Value for Array a["+i+"] : ");
            a[i] = in.nextInt();
        }

        System.out.print("\nEnter the position of the Array which is to be deleted : ");
        pos = in.nextInt();

        array_delete(a,pos,len);
        in.close();
    }

    public static void array_delete(int a[],int pos,int len){
        for(int i=pos; i<len-1; i++)     // Re-arrange the array position
            a[i] = a[i+1];

        len = len-1;     // Decrease the Array by 1

        System.out.println("\n New Array after Deleting element ");
        for(int i=0; i<len; i++)
            System.out.print(a[i]+" ");

    }
}
