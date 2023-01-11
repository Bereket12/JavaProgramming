package Test1;

import java.util.Scanner;

public class textSplit {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String sentence = input.nextLine();
      int count=0;
        System.out.println( "java is java ");
     for (String n: sentence.split(" ")){
        if(sentence.indexOf(0)==1) {
            count++;

        }
     }
        System.out.print(count);

    }
}
