package Day8;

import javax.imageio.stream.ImageInputStream;

public class Loans {

    public static void main(String[] args) {

      /*  To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650

        Otherwise print: "Loan Denied"*/


            int salary = 60000;
            int creditScore= 650;


        System.out.println();
            if (creditScore <=650){
                System.out.println("Salary "+salary);
                System.out.println("Loan Approved");
                System.out.println(creditScore);
            }else {

                System.out.println("Loan Denied");
            }

    }

}
