package Test2;

import java.util.Scanner;

public class guest {

        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner input = new Scanner(System.in);
            String guess=" ";
            System.out.println("Please enter the guest's name:");
            String name=input.nextLine();
            int count=1;
            for (int i=1;i<=name.length(); i++){
               if (name.charAt(i)==' '&& name.charAt(i+1)!=' '){
                   count++;
               }
               }
            System.out.println(name+" "+count);
    }

}
