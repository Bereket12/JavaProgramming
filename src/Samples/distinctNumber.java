package Samples;

import java.util.Scanner;

public class distinctNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
         int Len=nums.length;
        for (int i = 0; i <Len ; i++) {
            for (int j=0; j<=i; j++){
                if(nums[i]==nums[j]){

                }

            }
         }
        System.out.println("Duplicate ");
    }
}
