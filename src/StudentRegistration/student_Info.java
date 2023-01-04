package StudentRegistration;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class student_Info {
    private int  id;
    private String name;
    private int age;
    private int year_Student;
    private double price;
    private String level ;

    private String Department;
    private String course;
    private int ch=50;

    Scanner sc= new Scanner(System.in);
    public student_Info(int id, String name, int dob, int year_Student, double price, String level) {
        this.id = id;
        this.name = name;
        this.age = dob;
        this.year_Student = year_Student;
        this.price = price;
        this.level = level;

    }

    public int getId() {
       return id;
    }
    public void setId(int id) {

        Random r= new Random();
        int number=r.nextInt(50);
        id=number;
        this.id = id;
    }
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {

        Department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Enter Your name ");
        name=sc.nextLine();
        this.name = name;

    }

    public int getAge() {
        
        return age;
    }

    public void setDob(int age) {
       int y= LocalDate.now().getYear();
       y= y-age;
       age = y;
   this.age=age;
    }

    public int getYear_Student() {
        return year_Student;
    }

    public void setYear_Student(int year_Student) {
        System.out.println("Enter Your Date Enter");
        year_Student=sc.nextInt();
        this.year_Student = year_Student;
       // return year_Student;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        int tc;
        System.out.println("how many credit hour do you take now  ");
       tc= sc.nextInt();
       price=ch*tc;

        this.price = price;

    }

    public String getLevel() {

        return level;
    }

    public void setLevel(String level) {
        System.out.println("Please input Level of class");
        level=sc.nextLine();
        this.level = level;

    }
}
