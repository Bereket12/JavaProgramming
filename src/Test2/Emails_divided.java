package Test2;

import java.util.Scanner;

public class Emails_divided {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email=scan.nextLine();



        int at=email.indexOf('@');
        int domain=email.indexOf('@');
        int dot=email.indexOf('.');
        int name= email.indexOf('_');
        System.out.println("First name: "+email.substring(0,1).toUpperCase()+email.substring(1,name));
        System.out.println("Last name: "+email.substring(name+1,name+2).toUpperCase()+email.substring(name+2,at));
        System.out.println("Domain: "+email.substring(domain+1,domain+2).toUpperCase()+email.substring(domain+2,dot));

//berekt_habtu@gmail.com

    }
}
