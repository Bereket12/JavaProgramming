package Test2;

class Employee{
    public int salary;
}
class A{
    protected void methodA(){
        System.out.println("Method A");
    }
}
class Bc extends A{
    public void methodA(){
        System.out.println("Method C");
    }
    public void methodBc(){
        System.out.println("Method B");
    }
}
public class B {

    public static void main(String[] args) {
           A obj = new Bc();
           obj.methodA();
    }
}
