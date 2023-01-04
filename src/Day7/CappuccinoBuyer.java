package Day7;

import java.util.Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        /*
        	tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories*/
                System.out.println("Enter coffee size");
                Scanner sc=new Scanner(System.in);
                String cup= sc.nextLine();
                System.out.println(cup);
        if("tall".equals(cup) ||"grande".equals(cup)|| "venti".equals(cup)) {
            if (cup.equals("tall")) {
                System.out.println("price is $3.69");
                System.out.println("90 calories");
            }if(cup.equals("grande")){
                System.out.println("price is $3.99");
                System.out.println("120 calories");

        }if (cup.equals("venti")){
                System.out.println("Price is $4.29");
                System.out.println("150 calories");
            }
        }
    }
}
