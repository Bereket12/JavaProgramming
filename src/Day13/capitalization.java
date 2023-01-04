package Day13;

import java.util.Scanner;

public class capitalization  {

public static void capital(String fName,String lName) {
    Scanner scan =new Scanner(System.in);

    System.out.print("Enter Your First Name: ");
     fName=scan.nextLine();
    System.out.print("Enter Your Last Name: ");
     lName=scan.nextLine();

    System.out.println(fName.substring(0,1).toUpperCase()+fName.substring(1,fName.length())+" "+lName.substring(0,1).toUpperCase()+""+lName.substring(1,lName.length()));

}
    public static void main(String[] args) {
        capitalization capitals=new capitalization();
        capitals.capital("","");
    }
}