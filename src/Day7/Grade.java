package Day7;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        char grd = input.next().charAt(0);
         String result=" ";
        if (grd == 'a' || grd == 'b' || grd == 'c' || grd == 'd' || grd == 'f'||grd == 'A' || grd == 'B' || grd == 'C' || grd == 'D' || grd == 'F') {
            if (grd == 'a' ||grd =='A') {
                result="excellent";
            }
            if (grd == 'b'||grd=='B') {

                result="great job";
            }
            if (grd == 'c'||grd=='C') {
                result="good";
            }
            if (grd == 'd'||grd=='D') {

                result="passed";
            }
            if (grd == 'f'||grd=='F') {
                result="fail";
            }
            System.out.println(result);

        }

    }
}