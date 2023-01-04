package Day12;

import java.util.Scanner;

public class String_compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username="Cydeo";
        String password="cydeo@SCHOOLS";
         String usernames=input.nextLine();
        System.out.println("Enter password");
         String passwordS=input.nextLine();
        if(usernames.length() == username.length() && passwordS.length()==password.length()){
            System.out.println("You are login");

        }else if(usernames.length() != username.length() && passwordS.length() !=password.length()) {

            System.out.println("Please try again: ");
             String_compare string= new String_compare();
        }
    }
}
