package Test2;

import java.util.Scanner;
class Mains {

    public static void cube(){

        int n = new Scanner(System.in).nextInt();
        int result = n*n*n;
        System.out.println( result);
    }

    public static void main(String[] args) {
       cube();
    }



}