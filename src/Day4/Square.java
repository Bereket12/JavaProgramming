package javaProgramming;
import java.util.Scanner;
public class Square {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int side;
    int area;
    int perimeter;

	System.out.println("Enter area of side ");
	 area = sc.nextInt();
	 
	 System.out.println("Enter side number ");
	 side = sc.nextInt();
	
	int sideOfsquare=area*area;
	int primeter = side*area;
	System.out.println(" Area of the square is: "+sideOfsquare);
	System.out.println("Perimeter of the square is : "+primeter);
	
	
}
}
