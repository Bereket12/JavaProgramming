package Test1;

import java.util.Scanner;

public class stringTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string ");
        String input = scan.nextLine();
        int count=0;
        for (int i = 0; i < input.length(); i++) {
            if (input.contains("java")&& input.charAt(i) == ' '&&(input.charAt(i + 1) != ' '))
                count++;
        }
        System.out.println(count);
    }
}
