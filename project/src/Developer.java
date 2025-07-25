public class Developer extends Employee  {
    
    protected Department department;
    public Developer()
    {
        
    }
    public Developer(int i , int a , String n , int sal , Department department) 
    {
        super(i,a,n);
       
        this.department = department;
        department.addEmployee(this);

        
    }
    @Override public float calculateSalary() {
        return department.getBaseSalary()*numberOfHoursWorked;
    }
    @Override public void employeeDetails()
    {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Number of Hours Worked: " + getNumberOfHoursWorked());
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}
