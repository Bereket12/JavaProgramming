package Test2;

import java.util.Scanner;

class Main {
    public static double waterTax(double units){
        if(units<=50){
            units=units*0.6 ;
        }else if(units>=50){
            units=units*0.90;
             if(units >=100){
                units= (units*0.90)+50;
            }else if(units >=150){
                units=(units*0.90)+150;
            }
        }
               return units;
}//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }

}
