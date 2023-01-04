package Samples;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };


        double ave=0;
        for(double count:temps){

             ave=(temps[0]+temps[1]+temps[2]+temps[3]+temps[4]+temps[5]+temps[6]+temps[7])/8;
        //   System.out.println(count);
 }
        System.out.println(ave);


    }
}
