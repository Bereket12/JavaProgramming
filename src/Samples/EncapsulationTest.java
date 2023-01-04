package Samples;

class Area{
   private   void init(){
       System.out.println("Initialized");

    }
    private  void start(){
       init();
        System.out.println("started");
    }
}

public class EncapsulationTest {
    public static void main(String[] args) {
Area rectangle = new Area();
      // rectangle.start();
      // rectangle.init();
    }
}
