package javaProgramming;

import java.util.Scanner;

public class GallonsToLiters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	double gallon = 3.79;
	
	//double lb = 2.2;
	//double kg_lb= kg* lb;
	//System.out.println(kg_lb);
	System.out.println("10.5 kilos is equal to 23.1 pounds");
	
	//hint 1 kg = 2.2 lb
	
	System.out.println("************************* kg To lb*************************");
	System.out.println("Enter a number what you want to conver to change gallon to Liter");
	int num=(int) sc.nextDouble();
	double x = num * gallon ;
	System.out.println(x+"L");
}
}
