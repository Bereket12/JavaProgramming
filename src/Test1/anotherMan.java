package Test1;

import java.util.Scanner;

public class anotherMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int n = input.nextInt();
        String a = name.substring(0, n);
        String b = name.substring(0,n);
        if (b.equals(a)) {
            System.out.println(true);
        } else if(!b.equals(a)) {
            System.out.println(false);
        }

        // return false;
        System.out.println(name.equals("abXYab"));

    }

    }

