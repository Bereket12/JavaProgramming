package Samples;
import java.util.*;
class Main {
    /*if the grade is bigger than or equals to `90` output `excellent`
     * if the grade is bigger than or equals to `70` and smaller than `90` output `good`
> - if the grade is bigger than or equals to `60` and smaller than `70` output `pass`
> - if the grade is smaller than `60` output `fail`*/
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();
        //if(grade > 90 ||grade>70 || grade> 60 || grade <60 ){
        if(grade >= 90) {

            System.out.println("excellent");
        }else if(grade >=70 || grade<90) {

            System.out.println("good");
        }else if(grade >=60 || grade<70) {

            System.out.println("pass");
        } else if(grade <60){
            System.out.println("Fail");
        }

    }
}

