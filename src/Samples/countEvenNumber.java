package Samples;

import java.util.Scanner;

public class countEvenNumber {
    public static void main(String[] args) {
        int evenCount=0;
       Scanner input = new Scanner(System.in);
       int num[]={ input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] % 2 == 0)
            {

                evenCount++;
            }
        }
        System.out.println(evenCount);
    }
}
