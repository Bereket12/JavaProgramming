package Samples;

import java.util.Scanner;

public class stringSplit {
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
        System.out.println("Enter a String ");
        String name=input.nextLine();
       ///String a b c j a m a b c
        //       0 1 2 3 4 5 6 7 8
        int x=  name.lastIndexOf("jam");

        System.out.println(name.substring(x,x+3));





    }
}
