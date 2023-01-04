
package Day13;
import  java.util.Scanner;
public class emailDomain {
    public  static void emailDomain(String domain){
  Scanner emails= new Scanner(System.in);
        System.out.println("Enter Email Address");
     domain=emails.nextLine();

       if (domain.endsWith("gmail.com")){

           System.out.println("domain name  is: Gmail" );
       }else if(domain.endsWith("yahoo.com")){
           System.out.println("domain name  is: Yahoo");


       }else{
           System.out.println("please Enter the correct Email Address");
       }

    }
    public static void main(String[] args) {
        emailDomain Email = new emailDomain();
        Email.emailDomain("");
    }
}
