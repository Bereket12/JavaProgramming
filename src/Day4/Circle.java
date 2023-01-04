package javaProgramming;
import java.util.Scanner;
public class Circle {
public static void main(String[] args) {
	double radius;
   double  arearadius;
    double perimeter;
    double pi =3.14;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Eneter  the Radius ");
	radius=sc.nextDouble();
     arearadius=radius*radius*pi;
    double diameter =(radius/2)*pi;
    System.out.println("the area of the circle is: "+arearadius);
    //Area of a circle = π * (d/2)2
    //pi 3.14(5/2)
    
    System.out.println("the area of the primeter is: "+diameter);
}
}
