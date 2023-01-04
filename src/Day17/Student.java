package Day17;

public class Student {
    String name,studentId ;
    char gender;
    int age;
    boolean isFullTime;
     public void studentInfo(){
         name="John Janny";
         gender='M';
         age=32;
         studentId="4857ID";
         isFullTime = true;
         System.out.println("name: "+name);
         System.out.println("gender: "+gender);
         System.out.println("age: "+age);
         System.out.println(name+" ID: "+studentId);
         System.out.println(name+" is FullTime Student: "+isFullTime);
       }

    public static void main(String[] args) {
        Student su = new Student();
        su.studentInfo();
    }
}
