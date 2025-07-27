public class Developer extends Employee  {
    
    protected Department department;
    protected int numberofProjects;
    public Developer()
    {
        
    }
    public Developer(int id , int age , String name , String nationality, int salary , Department department) 
    {
        super(id,age,name,nationality);
        this.department = department;
        department.addEmployee(this);

        
    }
    public void setNumberOfProjects(int numberofProjects) {
        this.numberofProjects = numberofProjects;
    }
    public int getNumberOfProjects() {
        return numberofProjects;
    }
    @Override public float calculateSalary() {
        return department.getBaseSalary()*numberofProjects;
    }
    @Override public void employeeDetails()
    {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Projects: " + getNumberOfProjects());
    }
}
