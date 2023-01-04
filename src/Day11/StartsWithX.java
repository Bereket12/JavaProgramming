package Day11;

import java.util.Scanner;

/*Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                   Input:
                       xcodex
                   Output:
                       acodex

*/
public class StartsWithX {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
       char cha;
        System.out.println("Enter a word");
        String word=input.nextLine();
               cha=word.charAt(0);
        System.out.println(word.replace(cha, 'x'));

    }
}
