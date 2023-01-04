package Day17;

public class Salary_Calculator {
    public double perHour,stateTaxRate,federalTaxRate,Fica;
    public int weeklyHours;
    public void salaryInfo(){
        perHour=15.50;
        stateTaxRate=5;
        federalTaxRate=10;
        weeklyHours=40;
        Fica =6.2;
}

     public void salary  (){
         double weeklyHour= weeklyHours*2;
         double GrossIncome= perHour*weeklyHour;
         System.out.println("Gross Income: "+GrossIncome);

         double federalTax=weeklyHour*10/100;
         double stateTax=weeklyHour*5/100;
         double fica=weeklyHour*6.2/100;
         double Deduction= federalTax+stateTax+fica;
         System.out.println("Deduction: "+Deduction);
         double net = GrossIncome-Deduction;
         System.out.println("Net Income: "+net);


     }

    public static void main(String[] args) {
        Salary_Calculator sc= new Salary_Calculator();
sc.salaryInfo();
    sc.salary();
    }


}
