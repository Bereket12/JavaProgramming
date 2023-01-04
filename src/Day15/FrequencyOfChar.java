/*Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
          inputs:
            str = "aabcccd";
            char = 'c';
        output: 3
 */

package Day15;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int count=0;
        System.out.println("Enter A string ");
      String str=input.nextLine();
        System.out.println("Enter a character");
        char findChar=input.next().charAt(count);

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)== findChar){
            count++;
    }
        }
        System.out.println(count++);
              }
}
