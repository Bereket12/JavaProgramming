public class JavaTester {
int num,y;
    JavaTester(){
 y=3;
        System.out.println("Constructor " +y);

    }//constructor
    public void nums(){
        num=5;
        System.out.println("Method " +num);
    }

    public static void main(String[] args) {
        JavaTester tester= new JavaTester();
        tester.nums();
    }
}
