package Day11;

import java.util.Scanner;

public class WebsiteAddress {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
      String commercial =input.nextLine();


        if (commercial.startsWith("www.")&& commercial.endsWith(".com")){
            System.out.println("Valid commercial website");
        } else if (commercial.startsWith("www.") && commercial.endsWith(".edu")){
            System.out.println("valid educational Website ");
        } else if (commercial.startsWith("www.") && commercial.endsWith(".gov")) {
            System.out.println("valid government website");
        } else {

            System.out.println("is not valid website ");
        }
    }
}
