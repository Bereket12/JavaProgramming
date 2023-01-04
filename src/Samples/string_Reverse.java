package Samples;

import java.util.Scanner;

public class string_Reverse {

  public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();
            String count="";
            String outputString = "";

            for (int i = sentence.length()-1; i >= 0; i--)
            {
                outputString = outputString + sentence + " ";
            }

            System.out.println(outputString);

            }
        }
