package Samples;

import java.util.Scanner;

public class indexOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        int y=0;
        int z=0;
        //int z[]={0};
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
            y = nums[1];
           z=nums[nums.length-2];
            //int second_Element = arr[arr.length - 2];

             }



        System.out.println(y);
        System.out.println(z);



    }
}
