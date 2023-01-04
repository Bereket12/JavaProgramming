class Test {
    public Test( ) {
        System.out.println ("Test");
    }
    public void  B() {
        System.out.print("B ");
    }
}

            class B extends Test {

                    public class Test extends B{
                        public Test( ) {
                            System.out.print("C ");
                        }

                            public static void main (String [] args){
                                B obj = new B();
                                obj.B();
                            }

                            }
                        }