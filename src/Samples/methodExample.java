package Samples;

public class methodExample {
    //different types of method methods use Java
    public static void main(String[] args) {
     //  sum(5,6);
       int result=mul(5,6);
        System.out.println(result);
        String names=name("sara ");
        System.out.println("Full name = " + names);

    }

   //this method show is not return value
  /*  public static void sum(int num1,int num2){
    System.out.println(num1+num2);
   }*/


   //this method return value
   public static int mul(int x,int y){

       return x*y;
   }
   public static String name(String sara){
        String names="aaron";
        return sara+names;

   }



}
