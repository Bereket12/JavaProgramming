package Samples;

public class ternary {
    public static void main(String[] args) {
        int x=69;
        int y=89;
        int z=79;
        int num=  (y>x)?(x>z?x:z):(y>z? y:z);
        System.out.println("num = " + num);
    }
}
