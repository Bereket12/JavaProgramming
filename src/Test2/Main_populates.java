package Test2;
import java.util.Scanner;
public class Main_populates {


    private static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        populate(n);
    }
    public static void populate (int n){

        int a[] = new int[10], i ;
        Scanner input = new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.print("Enter number "+(i+1)+ " in array=");
            a[i] = input.nextInt();
        }
        System.out.println("You have entered the following values in Array:");
        for(i=0;i<10;i++)
            System.out.print(a[i]+",");


    }

}
