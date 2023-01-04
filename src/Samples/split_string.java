package Samples;

import java.util.Scanner;

public class split_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence =input.nextLine();

       // String str = "geekss@for@geekss";
        String[] arrOfStr = sentence.split("j", -1);

        for (String a : arrOfStr)
            System.out.println(a);
    }



    }

