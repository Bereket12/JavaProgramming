package Test2;

import java.util.Scanner;

class profitss {

    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW
        String p=" ",l=" ",n=" ";
        if(sellPrice >buyPrice){
             p="profit";
            return p;
        }else if(buyPrice > sellPrice){
             l="Loss";
            return l;
        }
        else if(buyPrice== sellPrice){
             n="no loss";
            return n;
        }
         return profit(100,2);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

}