import java.util.ArrayList;

public abstract class Employee {
    public enum SEX {
        Male,Female;
    }
    protected String name;
    protected int id;
    protected int age;
    protected SEX sex;
    protected String nationality;
    protected Department department;
    protected ArrayList<String> assignedProjects = new ArrayList<>();
    protected int assignedProjectsCount = 0;
    
    public Employee() {

    }
    public Employee (String name , int id , int age , SEX sex , String nationality) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.nationality = nationality;
    }
    

    public void setName(String name)
    {
        this.name = name;
    }
    public void setSex(SEX sex)
    {
        this.sex = sex;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName ()
    {
        return name;
    }
    public int getId ()
    {
        return id;
    }
    public int getAge ()
    {
        return age;
    }
    public SEX getSex()
    {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }


    public abstract float calculateSalary();
    

    public void employeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Sex: " + getSex());
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge());
        System.out.println("Nationality: " + getNationality());
        
    }

    
}
