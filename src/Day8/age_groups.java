package Day8;

import java.util.Scanner;

public class age_groups {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int name= input.nextInt();
    String age;
        age=name==1 || name==2? "Infant":" ";
        System.out.println(age);
        age=name==3 || name==5? "Toddler":" ";
        System.out.println(age);
        age=name==6 || name==9? "Kid":" ";
        System.out.println(age);
        age=name==10 || name==12? "Pre-Teen":" ";
        System.out.println(age);
        age=name==13 || name==17? "Teenager":" ";
        System.out.println(age);
        age=name==18 || name==20? "Young Adult":" ";
        System.out.println(age);
        age=name==21 || name==39? "Adult":" ";
        System.out.println(age);
        age=name==40 || name==49? "Young Middle-Aged Adult":" ";
        System.out.println(age);
        age=name==50 || name==54? "Middle-Aged Adult":" ";
        System.out.println(age);
        age=name==55 || name==64? "Very Young Senior Citizen":" ";
        System.out.println(age);
        age=name==65 || name==74? "Young Senior Citizen":" ";
        System.out.println(age);
        age=name==75 || name==84? "Senior Citizen":" ";
        System.out.println(age);
        age= name>85?"Old Senior Citizen ":" ";
        System.out.println(age);
    }
}
/*
	                     Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
*
* */