package Day9;

import java.time.LocalDate;

public class BankOfAmerica {
    public static void main(String[] args) {
        Tester tester1 =new Tester("josh",'M', LocalDate.of(1985,4,5),"A01","QA",1000);
        System.out.println(tester1);
    }
}
