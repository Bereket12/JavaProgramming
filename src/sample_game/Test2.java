package sample_game;

import java.util.*;
public class Test2 {
    public static void main(String[] args)
    {
        Test2 t = new Test2();
        Scanner scan = new Scanner(System.in); //ignore
        System.out.println("enter a value");
        int input = scan.nextInt(); //ignore
        scan.close(); //ignore
        int randomNum = (int)(Math.random()* 10);
        if(input == randomNum)
            System.out.println("well done smarty");
        else
            t.looser();
    }

      void looser() {
        int looserNum = (int) (Math.random() * 7);
        if (looserNum == 0)
            System.out.println("u r so stupid");
        else if (looserNum == 1)
            System.out.println("u r rediculus");
        else if (looserNum == 2)
            System.out.println("why r u on earth!!! go to venus");
        else if (looserNum == 3)
            System.out.println("u should be hanged out");
        else if (looserNum == 4)
            System.out.println(" don't dare to play it again");
        else
            System.out.println(" leave java now!!!");
    }


}
