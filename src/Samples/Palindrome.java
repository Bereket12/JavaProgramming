package Samples;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       String []word={"java","long word","civic","apple","racecar","mom","ann"};
        String reverse="";
        int length = word.length;
        reverse= String.valueOf(word);
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + reverse.charAt(i);
        if (reverse.equals(reverse)) {
           /*

           for(String w :"reverse") {
               System.out.println(reverse);
           }
            */
        } else
            System.out.println(false);


    }

}
