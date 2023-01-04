package Samples;

import java.util.Scanner;

public class sample_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String name=scan.nextLine();
        System.out.print("Enter Your Last Name: ");
        String name1=scan.nextLine();

        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1,name.length())+" "+name1.substring(0,1).toUpperCase()+""+name1.substring(1,name1.length()));
    }
}
