package Samples;

import java.util.Random;
import java.util.Scanner;

public class email_divided {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Email Address");
        String email=scan.nextLine();
        String sp= String.valueOf(email.split("@"));
        System.out.println(sp.toString());
    }
}