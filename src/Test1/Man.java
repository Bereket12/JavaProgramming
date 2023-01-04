package Test1;

import java.util.Scanner;

public class Man {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        word.equalsIgnoreCase(word);
        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }else if(word.contains("x") ||word.contains("X")){
            System.out.println(word.substring(0,word.length()-1));
        } else if(word.contains("x") || word.contains("x") && word.contains("X")|| word.contains("X")){
            System.out.println(word.substring(1,word.length()-2));
        }else{
            System.out.println(word);
        }
    }
}