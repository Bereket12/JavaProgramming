package Samples;

import java.util.Scanner;
public class firstCharFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words[]={input.nextLine(),input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
           for(int x=0;x<=4;x++){
             int n=words[x].length();
             char first=words[x].charAt(0);
             char last=words[x].charAt(n-1);
                System.out.println(first+""+last);
        }
        }

/*

 for(int i=0;i<str.length();i++){
            strIncremented+=(char)(str.charAt(i)+1);
        }
 */
    }

