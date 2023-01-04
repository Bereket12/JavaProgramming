package Samples;

import java.util.Scanner;

public class sampleString {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
         String mid=input.nextLine();
         // a a j a m a a
        if (mid.equals(mid.toString())){
            int x = mid.lastIndexOf("jam");
            System.out.println(mid.substring(x,x+3));

        } else if (mid.equals(mid.toString())) {
             int y=mid.lastIndexOf("A");
             System.out.println(mid.substring(y,y+1));


        }

        //;
            ;





    }


}
