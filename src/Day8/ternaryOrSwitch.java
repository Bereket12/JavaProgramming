package Day8;

import java.util.Scanner;

/*
5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			 1: Hello, thank for your call
			 2: Hola, gracias para llamar
			 3: Merhaba, aradiginiz icin tesekkurler
			 4: Privet, spasibo za vash zvonok
			 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement*/
public class ternaryOrSwitch {

    public static void main(String[] args) {
        int Selection=1;
        Scanner input = new Scanner(System.in);
        System.out.println("--------Choose Language--------------");
        System.out.println("1: Hello, thank for your call");
        System.out.println("2: Hola, gracias para llamar");
        System.out.println("3: Merhaba, aradiginiz icin tesekkurler");
        System.out.println("4: Privet, spasibo za vash zvonok");
        System.out.println("5: Merci ,pour votre appel");

        System.out.println("----------         ---------------");
        Selection= input.nextInt();
        switch (Selection){
            case 1:
                  System.out.println("Hello, thank for your call");
                  break;
            case 2:
                  System.out.println("Hola, gracias para llamar");
                  break;
            case 3:
                  System.out.println("Merhaba, aradiginiz icin tesekkurler");
                  break;
            case 4:
                  System.out.println("Privet, spasibo za vash zvonok");
                  break;
            case 5:
                  System.out.println("Merci ,pour votre appel");
                  break;



        }
    }
}
