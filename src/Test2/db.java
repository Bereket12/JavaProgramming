package Test2;

import java.util.Scanner;

class db {
    public static String lameDb(String db, String op, String id, String data) {

      String dbs=db+op+id+data;
      return dbs;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}
