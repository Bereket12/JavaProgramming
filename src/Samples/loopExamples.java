package Samples;

import java.util.Scanner;

public class loopExamples {
    public static void main(String[] args) {
        int num=0;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            num=input.nextInt();

        }while(num%2!=0);
        System.out.println(num+" Your number is Even");
    }
}
