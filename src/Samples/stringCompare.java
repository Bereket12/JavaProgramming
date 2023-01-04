package Samples;

public class stringCompare {
    public static void main(String[] args) {
        String s1="Java Programming Languages works in different Platform ";
        String s2 ="java is hard language compares to other  language!!!!!!";
        String s3="programming is like game";
        if(s1.length() > s2.length()) {
            System.out.println("my name is Java Programming Language");
        }else if(s2.length()>s1.length() ) {
            System.out.println("java is very hard language compare to others language!!!");
        }else if(s1.length()==s3.length()){
            System.out.println("the Two string are equals ");
        } else if (s1.length()==s2.length() && s1.length()==s3.length() && s2.length()==s3.length()) {
            System.out.println(s1+" " + s2+"  "+s3+"");
        } else if (s1.length()==s3.length()) {
            System.out.println("s1 = " + s1 + "s2" +"");

        }else{
            System.out.println(s1.length()==s2.length() && s1.length()>s3.length() && s2.length()>s3.length());
            System.out.println("s1 = " + s1+ "\ns2= "+s2) ;
        }


    }
}
