public class Developer extends Employee implements AssignProject {
    
    protected Department department;
    protected int numberofProjects;
    private static int developerCount = 0;
    public Developer()
    {
        developerCount++;
    }
    public Developer(int id , int age , String name , String nationality, int salary , Department department) 
    {
        super(id,age,name,nationality);
        this.department = department;
        department.addEmployee(this);
        developerCount++;
        
    }
    public static int getDeveloperCount() {
        return developerCount;
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
    @Override public void assignProject(String projectName) {
        this.assignedProject = projectName;
        System.out.println(getname() + " has been assigned to project: " + projectName);
    }
    @Override public String getAssignedProject() {
        return assignedProject;
    }
    @Override public void employeeDetails()
    {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Projects: " + getNumberOfProjects());
        System.out.println("Assigned Project: " + getAssignedProject());
        System.out.println("-----------------------------");
    }
}
