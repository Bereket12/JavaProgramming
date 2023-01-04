package Samples;

import java.util.Scanner;

public class Large_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int count = nums[0];
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] > count)
                count = nums[i];

        }
        System.out.println(count);
    }
    }