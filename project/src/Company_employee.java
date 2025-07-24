public class Company_employee extends Employee implements Department {
    int sal;
    String department;
    public Company_employee()
    {
        
    }
    public Company_employee(int i , int a , String n , int sal , String department )
    {
        super(i,a,n);
        this.sal = sal;
        this.department=department;
    }
    public void set_department (String d)
    {
        department=d;
    }
    public void set_sal(int sal)
    {
        this.sal = sal;
    }
    public String get_department()
    {
        return department;
    }
    public int get_salary()
    {
        return sal;
    }
}
