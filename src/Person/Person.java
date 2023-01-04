package Person;

public class Person {
    private String firstName,lastName;
    private int age;

    //constructor

    // this is not default constructor
    public Person(String firstName,String lastName) {
       this.firstName=firstName;
       this.lastName=lastName;
       this.age=age;
    }



//name and age getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
//end of get age

    //setter name and age
    public void setFirstName(String firstName) {
       this.firstName=firstName;

    }

    private boolean setFirstNames(String firstName) {

        for (int i = 0; i < firstName.length(); ++i) {
            char ch = firstName.charAt(i);
            if (Character.isDigit(ch)) {
                System.err.println("You can not use the First name with digit ");
                return false;
            }
        }
        return true;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;

    }
    private  boolean setLastNames(String lastName) {

        for (int i = 0; i < lastName.length(); ++i) {
            char ch = lastName.charAt(i);
            if (Character.isDigit(ch)) {
                System.err.println("You can not use the First name with digit ");
                return false;
            }
        }
        return true;


    }



    public void setAge(int age) {

        if(age<0){
            System.err.println("Your are not enter proper Age ");
        }else{
            this.age=age;
        }
     //   this.age = age;
    }




    //setter name

    //setter age

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }


    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
