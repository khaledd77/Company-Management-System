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
    

    public void setname(String name)
    {
        this.name = name;
    }
    public void set_sex(SEX sex)
    {
        this.sex = sex;
    }
    public void set_id(int id)
    {
        this.id = id;
    }
    public void set_age(int age)
    {
        this.age = age;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getname ()
    {
        return name;
    }
    public int get_id ()
    {
        return id;
    }
    public int get_age ()
    {
        return age;
    }
    public SEX get_sex()
    {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }


    public abstract float calculateSalary();
    

    public void employeeDetails() {
        System.out.println("Name: " + getname());
        System.out.println("Sex: " + get_sex());
        System.out.println("ID: " + get_id());
        System.out.println("Age: " + get_age());
        System.out.println("Nationality: " + getNationality());
        
    }

    
}
