package javaProgramming;
import java.util.Scanner;


public class KilosToPounds {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	double kg = 10.5;
	double lb = 2.2;
	double kg_lb= kg* lb;
	System.out.println(kg_lb);
	System.out.println("10.5 kilos is equal to 23.1 pounds");
	
	//hint 1 kg = 2.2 lb
	
	System.out.println("*************************kg To lb *************************");
	System.out.println("Enter a number what you want to conver to change killos to lb");
	int num=(int) sc.nextDouble();
	double x = num * lb;
	System.out.println(x);
}
}
