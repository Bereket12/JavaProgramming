
// number 3 question
package Day6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;

        System.out.println("Enter number 1");
        num1 = sc.nextDouble();
        System.out.println("Enter number 1");
        num2 = sc.nextDouble();
        System.out.println("Enter operator +,/,*,-");
        char cal = sc.next().charAt(0);

        if (cal == '/') {
        result = num1 / num2;
            System.out.println(result);
        } if(cal == '*') {
            result = num1 * num2;
            System.out.println(result);
        }  if (cal == '+') {
            result =num1 + num2;
            System.out.println(result);
        } if (cal == '-') {
            result =num1 - num2;
            System.out.println(result);
        }
    }
}
