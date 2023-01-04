package Day13;
import java.util.Scanner;
public class eligibleToVote {

    public static void eligibleToVote(int age ,Boolean isAmerican ){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Your age");
        age=input.nextInt();
        if(age>=23){

            System.out.println(age);
        }

    }

    public static void main(String[] args) {


    }
}
