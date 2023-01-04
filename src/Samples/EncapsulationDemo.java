package Samples;

class Student {
    private static int rollNo;
    private String name;

    public void setRoll(int r) {
        rollNo = r;

    }

    public static int getRollNo() {
        return rollNo;
    }
}

    public class EncapsulationDemo{

        public static void main(String args[]){

            Student s1= new Student();
            s1.setRoll(2);
            System.out.println(s1.getRollNo());

        }
    }