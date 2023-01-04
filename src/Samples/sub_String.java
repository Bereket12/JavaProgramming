package Samples;

public class sub_String {
    public static void main(String args[]){
        String s1="This is Java substring()";
        String s2 ="Barefoot";
                  //B a  r  e f o o t
                 //0, 1, 2, 3,4,5,6,7;
        System.out.println(s2.length());
        System.out.println("Barefoot = " + s2.substring(2,7));

    }
}
