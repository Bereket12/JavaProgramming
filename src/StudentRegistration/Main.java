package StudentRegistration;

public class Main {
    public static void main(String[] args) {
        student_Info si= new student_Info(123,"Sara",31,2022,1000,"College");
        System.out.println(si.getId());
        System.out.println(si.getName());
        System.out.println(si.getAge());
        System.out.println(si.getYear_Student());
        System.out.println(si.getLevel());

    }
}
