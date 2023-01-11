package Test1;

import java.util.Scanner;

public class countJavAndPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
    int count=1;
boolean s= sentence.contains("java");
       for (int i=0; i<sentence.length();i++){


               if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != 'j')) {
                   count++;
               }

       }
        System.out.println(count);



    }
}
