package Test2;
import java.util.Scanner;
public class Main_populate {


    private static int n;

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            populate(n);
        }
       public static void populate (int n){
              int j,i;
                 for (i =1; i<=n; i++){
                   //System.out.print("["+i+"]");
                     j=i;
                     System.out.print(j+",");

               }


           }


    }


