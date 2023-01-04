package Day9;

import java.time.LocalDate;

public class Tester {
    public  String name;
    public char gender;
    public LocalDate DOB;
    public int age;
    public String employeeId;
    public String jobTitle;
    public double salary;

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", age=" + age +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Tester(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary){
    this.name=name;
    this.gender=gender;
    this.DOB=DOB;
    age=LocalDate.now().getYear()-DOB.getYear();
    this.employeeId=employeeId;
    this.jobTitle=jobTitle;
    this.salary=salary;

    }

}
