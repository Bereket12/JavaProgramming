package Samples;

import java.util.Scanner;
public class String_Small {
    public static void main(String[] args) {

        String input;
        String[] words;
        int i;
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine();
        // Split sentence into words using split method of String
        words = input.split(" ");
        // Now, Print the sentence in reverse order
        for (i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
      }
}
