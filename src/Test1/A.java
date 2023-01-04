package Test1;
class test1 {
        protected void print() {
                System.out.println("A");

        }

        private void print(int a){
                System.out.println("B");
        }
}
public class A extends  test1{

        public void print(int a){
                System.out.println("C");
        }

        public static void main(String[] args) {
                A o= new A();
                o.print();
        }



}




