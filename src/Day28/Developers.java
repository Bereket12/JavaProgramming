package Day28;

public class Developers {

    private String name,programmingLanguage,jobTitle;
    private int age,id;
    private double salary;

    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;

    }
    public void setProgrammingLanguage(String pl){
    //{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}
String languages[]={"Java","JavaScript","Python","Ruby","C#","C++","Swift"};
String count="";
int lang=languages.length-1;
int i=0;
while( i<lang){
    System.out.println(languages[i]);
    programmingLanguage=pl;
i++;



}


    }

    public  String getProgrammingLanguage(){
        return programmingLanguage;

    }

    public void SetJobTitle(String newJobTitle){
       jobTitle=newJobTitle;

    }
    public String getJobTitle(){
        return jobTitle;

    }
    public void setAge(int Ag){
        age=Ag;
    }

    public int getAge(){
        return age;
    }
    public void setId(int ids){

        id=ids;
    }

    public int getId(){
        return id;
    }
    public void setSalary(double salaryS){
        salary=salaryS;
    }
    public double getSalary(){
        return salary;
    }


}
