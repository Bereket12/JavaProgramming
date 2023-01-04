package Day15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MarriagePropose {


    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    for (int i = 1; i <= 3; i++) {

        System.out.println("Will you marry me?");
        String mary = input.nextLine();

        if (mary.equals("yes")|| mary.equalsIgnoreCase("Yes")) {

            System.out.println("Congrats");
        } else if (mary.equals("no")||mary.equalsIgnoreCase("No") ) {
            System.out.println("Goodbye");
        } else {
            System.out.println("Invalid answer");
        }
    }
}



    }

