package Samples;

import java.util.Scanner;

public class StringReverse2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String sentence [] ={input.nextLine()};
       // String input = "Eyehunt website java";
        String count= String.valueOf(sentence);
        String strArray[]= count.split(" ");
        String output=" ";
        for (int i = strArray.length; i > 0 ; i--) {
            output =output+ " " +strArray[i-1];
 }
          System.out.println(output);
  }
}
