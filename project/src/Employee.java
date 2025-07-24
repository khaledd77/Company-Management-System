public class Employee {
    String name;
    int id;
    int age;
    public Employee () 
    {

    }
    public Employee (int id , int age , String name) 
    {
        this.id = id;
        this.age = age;
        this.name = name;
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
    
    
    
    

    

    



    
}
