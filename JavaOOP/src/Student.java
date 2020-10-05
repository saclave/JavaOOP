public class Student {

    public String name;
    public int age;
    public String idNo;

    public Student(String name, int age, String idNo){
        this.name = name;
        this.age = age;
        this.idNo = idNo;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getIdNo(){
        return idNo;
    }

}
