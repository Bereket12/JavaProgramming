package Person;

public class Persons {
    public static void main(String[] args) {
        Student s=new Student();
        //set fields values using setter methods
        s.setId (27);
        s.setName("Sara Arron");
        //print values using getter methods
        System.out.println("Student Data:" + "\nStudent ID:" + s.getId()
                + " Student Name:" + s.getName());

    }
}
