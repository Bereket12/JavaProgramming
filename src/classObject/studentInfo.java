package classObject;

public class studentInfo {
    public String name ;
    public int age;
    public char gender;
    public int batchNumber;
    public String groupName;

    public void setInfo() {
        this.name =name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "studentInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
