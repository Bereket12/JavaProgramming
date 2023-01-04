package Test2;
import java.util.*;

public class uniqueNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        int count=0;
         int num1=nums.length;
         int num2=nums.length;
         while(num1 >0){
             int r1=num1%10;
             while(num2>0){
                 int r2=num2 % 10;
                 if(r1==r2){
                      count++;
                 }
                 num2=num2/10;
             }
             if(count==1){
                 System.out.println("The number is unique");
             }
             else {
                 System.out.println("The number is not unique");
             }
         }
             }
        }




