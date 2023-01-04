package Samples;

import java.util.Scanner;

public class loop_samples {




            public static void main(String[] args) {
                //DO NOT TOUCH THESE LINES:
                Scanner scan = new Scanner(System.in);
                int inhabitants = scan.nextInt();
                //WRITE YOUR CODE HERE:


                int x= inhabitants;

                while( x>=6) {
                                     //2   2
                    for (int day = 0; day < x; day++) {

                        System.out.println("Day " + day + " [" + x + "]");
                        x /= 2;

                    }
                }

                System.out.println("---- EXTINCT ----");
                }



        }


