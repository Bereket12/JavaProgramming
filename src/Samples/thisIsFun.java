package Samples;

public class thisIsFun {
    int a;
    int b;
  public  void number(int a, int b) {
     this.a = a;
      this.b = b;
  }
  public static  void main(String[] args) {
        thisIsFun t= new thisIsFun();
       t.number(4,5);

        System.out.println(t.a);
        System.out.println(t.b);
    }
}
