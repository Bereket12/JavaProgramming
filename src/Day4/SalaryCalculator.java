package javaProgramming;
import java.util.Scanner;
public class SalaryCalculator {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
    
    double  stateTaxRate= 6;
    double federalTaxRate=26;
    
	System.out.println("Enter the payment hourly");
	double hr=sc.nextDouble();
	System.out.println("Enter the weekly hourly");
	double wh=sc.nextDouble();
	
	double employee=hr*wh;
	System.out.println("The payment weely "+"$"+employee);
	double pst=employee *stateTaxRate/100;
	System.out.println("State Tax "+"$"+pst);
	  employee =employee * federalTaxRate/100;
	  System.out.println("State Fedral Tax "+"$"+employee);
	
}
}
