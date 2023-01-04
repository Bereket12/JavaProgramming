package Samples;

import java.util.Scanner;

public class count_string {
    public static void main(String[] args) {
        String s1   = "my name is jon hijon";
        int lastPos = s1.lastIndexOf(' '); // return the index of the last occurrence

        s1 = s1.substring(lastPos + 1); // return `it`
        System.out.println(s1);
    }
}
