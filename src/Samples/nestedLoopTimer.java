package Samples;

import java.util.Scanner;


public class nestedLoopTimer {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minute");
        int min=input.nextInt();
        for (int m=min;m>0; m--){
            for (int s=59; s>=m;s--){
                System.out.println(min+" minutes"+"Second"+s);
               Thread.sleep(1000);
            }

        }
    }
}
