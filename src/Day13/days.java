package Day13;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Scanner;

public class days {

    public static void days(String day){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a month");
        day= input.nextLine();

        if ("april".equals(day)||"june".equals(day)||"september".equals(day)||"november".equals(day)){
            System.out.println(" "+day+"have 30 days");
            System.out.println("there are 4 month have 30 days");

        }else if ("january".equals(day)||"march".equals(day)|| "may".equals(day)||"july".equals(day)||"august".equals(day)||"october".equals(day)||"december".equals(day)){
            System.out.println(" "+day+" have 31 days");
            System.out.println("there are 7 month have 30 days");

        }else if ("february".equals(day)){

            System.out.println(" "+day+" have 28 or 29");
            System.out.println("there are 1 month have 28 or 29 days");
        }else {
            System.out.println("please enter the correct month");
        }


    }

    public static void main(String[] args) {

        days daysOfMonth=new days();
     ;
        daysOfMonth.days((""));



    }
}
