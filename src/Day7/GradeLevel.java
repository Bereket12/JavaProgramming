package Day7;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your grade ");
        int grade=sc.nextInt();
        /*
        *   1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
        * */
        if (grade >0 && grade <=18){
           if(grade >0 && grade <6){
               System.out.println("Elementary School");
            }if(grade >6 && grade<9){
               System.out.println("Middle Schools");
            }if (grade >9 && grade <13){
               System.out.println("High School");
            }if (grade >13 && grade <17){
               System.out.println("College");
            }if (grade >17 && grade <19){
               System.out.println("grad School");
            }


        }else {

            System.out.println("Invalid grade");
        }
    }
}
