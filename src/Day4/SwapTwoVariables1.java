package Day4;

public class SwapTwoVariables1 {
public static void main(String[] args) {
	int x=10;
	int y=15;
	int z;
	System.out.println("***************************************");
	System.out.println("Before Swap x value is "+x);
	System.out.println("Before Swap y value is "+y);
	System.out.println("***************************************");
	z=x;

	x=y;
	y=z;
	System.out.println("After Swap x and y Value");
	System.out.println("***************************************");
	System.out.println("The x value is "+x);
	System.out.println("The y value is "+y);
}
}
