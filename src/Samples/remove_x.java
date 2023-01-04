package Samples;

import java.util.Scanner;

public class remove_x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        if(word.startsWith("x")){
            System.out.println(word.substring(1,word.length()));
        } else if (word.endsWith("x")) {
            System.out.println(word.substring(1,word.length()-1));
        }else{
            System.out.println(word);
        }


    }
}
