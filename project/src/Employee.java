public abstract class Employee {
    protected String name;
    protected int id;
    protected int age;
    protected String nationality;
    protected Department department;
    protected String assignedProject;
    
    public Employee() {

    }
    public Employee (int id , int age , String name , String nationality) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nationality = nationality;
    }
    

    public void setname(String name)
    {
        this.name = name;
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

    public String getNationality() {
        return nationality;
    }


    public abstract float calculateSalary();
    

    public void employeeDetails() {
        System.out.println("Name: " + getname());
        System.out.println("ID: " + get_id());
        System.out.println("Age: " + get_age());
        System.out.println("Nationality: " + getNationality());
        
    }

    



    
}
