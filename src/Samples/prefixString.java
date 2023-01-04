package Samples;

import java.util.Scanner;

public class prefixString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String name=input.nextLine();
        System.out.println("Enter a number");
        int num=input.nextInt();
        if(name.charAt(num)>=name.charAt(num)){
            System.out.println(true);
            name.endsWith("");
        }
     //   return false;
    }
}
