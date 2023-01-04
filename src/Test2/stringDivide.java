package Test2;

import java.util.Scanner;

public class stringDivide {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String name=input.nextLine();
        //i
      //  int name= email.indexOf('_');
        //System.out.println("First name: "email.substring(1,name));
        if(name.contains("breadjam")){
            int z=name.indexOf("breadjam");
            System.out.println(name.substring(z,z+8));
        }else if(name.contains("j")){
            int x=name.indexOf('j');
            System.out.println(name.substring(x,x+3));
        }else if(name.contains("A")){
            int y=name.indexOf('A');
            System.out.println(name.substring(y,y+1));
        }










    }
}
