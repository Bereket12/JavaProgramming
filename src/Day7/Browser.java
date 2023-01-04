package Day7;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String browser ="chrome" ;
        String browser2="firefox";
        String browser3= "opera";
        String browser4= "safari";
        String browser5="edge";
        System.out.println("Enter browser name");
        String name=input.nextLine();
        if ("chrome".equals(name)|| "firefox".equals(name) || "opera".equals(name)||"safari".equals(name)||"edge".equals(name)){
            if (name.equals("chrome")){
                System.out.println("Chrome is Selected");
            }if (name.equals("firefox")){
                System.out.println("firefox is selected");
            }if (name.equals("opera")){
                System.out.println("opera is selected");
            }if (name.equals("safari")){
                System.out.println("safari is selected");
            }if (name.equals("edge")){
                System.out.println("edge is selected");
            }
        }
    }
}
