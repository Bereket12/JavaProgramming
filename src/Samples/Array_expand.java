package Samples;

import java.util.Scanner;

public class Array_expand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
      // int numb=nums.length;
        int  disNumbers= 0;
        int counter=0;
        boolean disFound=false;
        for (int i = 0; i <nums.length ; i++) {
            boolean isDis=true;
           for(int j=0; j<nums.length; j++){
               if (nums[i]==nums[j]&& i!=j){
                   isDis=false;
                }
           }
            if (isDis){
                counter++;
                if (!disFound){
                    disNumbers=nums[i];
                    disFound=true;
                }else{
            break;
                }
            }
        }
        if (counter >1){
            System.out.println(disNumbers+" more");
        }else if (counter ==1){
            System.out.println(disNumbers);
        }else{
            System.out.println("no");
        }




    }
    }

