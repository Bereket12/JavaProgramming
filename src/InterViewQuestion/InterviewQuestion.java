package InterViewQuestion;

import java.util.Scanner;

public class InterviewQuestion {
    public Scanner input= new Scanner(System.in);

    public void StringReverse(){

       System.out.println("Enter A String ");
       String rev=input.nextLine();

       for (int i=rev.length()-1; i>=0;i-- ){
           System.out.print(rev.charAt(i));
       }
       System.out.println("\n"+rev);
   }
   public void SwapNumbers(){
       System.out.println("Enter number x");
       int x=input.nextInt();
       System.out.println("The x value Before Swap : x="+x);
       System.out.println();
       System.out.println("Enter number y");
       int y=input.nextInt();
       System.out.println("The Y value Before Swap : y="+y);
       x=x+y;//6
       y=x-y;//y=5
       x=x-y;//1
       System.out.println("-------------------After Swap--------------------");
       System.out.println("After Swapping value the X value is changed to "+x);
       System.out.println("After Swapping value the Y value is changed to "+y);
   }

   public void vowelCheck(){
      // Scanner input= new Scanner(System.in);
       System.out.println("Enter a Word");
       String word=input.nextLine().toLowerCase();
       if(word.contains("a") || word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u")){
           System.out.println(true);
       }else{
           System.out.println(false);
       }

   }
   public void primeNumber(){
        //Prime numbers are natural numbers that are divisible by only 1 and the number itself.
       // 2, 3, 5, 7, 11, 13,
       System.out.println("Enter a number");
       int num=input.nextInt();
      if(num==0||num==1){
          System.out.println(false);
      }else if(num==2) {
          System.out.println(true);
      }
   }

    public static void main(String[] args) {
        InterviewQuestion strRev=new InterviewQuestion();
         //strRev.StringReverse();
        //strRev.SwapNumbers();
       //strRev.vowelCheck();
         strRev.primeNumber();

    }
}
