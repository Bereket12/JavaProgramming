package Day7;

import java.util.Scanner;

public class CrewAndPassenger {
    public static void main(String[] args) {
/*  Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

*/
        Scanner input = new Scanner(System.in);
        int passenger;
        String result=" ";
        String re="";
        int total;
        int crew;
        System.out.println("Enter Total Passenger");
       passenger= input.nextInt();

        if(passenger<=100){
            if (passenger==100){
               result="30 crew, 70 passenger";
            }if(passenger==75){

                result= "25 crew, 50 passengers" ;
            }if (passenger==50){
                result="20 crew, 30 passengers";
            }else if (passenger>100){

               result ="is not valid";
            }
            System.out.println(result);

        }
    }
}
