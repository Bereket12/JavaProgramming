package Test2;

public class evenOdd {
    public static void main(String[] args) {
        System.out.print("1 ");



        for(int t=2;t<=20;t++){

            if(t%2==0){

                System.out.print(t+" ");
            }
        }

        System.out.println();
        System.out.print("2");
        for(int t=0;t<=19;t++) {

            if (t % 1 == 0) {
                t += 1;
                System.out.print(" "+t);
            }
        }
    }
}
