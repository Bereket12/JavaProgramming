package Test2;
import java.util.Scanner;


    class stringReverse{
        public static String reverse(String input){
            //WRITE YOUR CODE BELOW:
            String name=" ";
            char ch;
            for (int i=0; i<input.length(); i++)
            {
                ch= input.charAt(i);
                name= ch+name;
            }

            return name;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(reverse(in.next()));
        }

    }

