public class Manager extends Employee implements AssignProject {
    
    protected int numberOfTeamsManaged;
    protected float hourlyRate;
    private static int developerCount = 0;


    public Manager() {
        developerCount++;
    }
    public Manager(int id, int age, String name, String nationality, Department department, int numberOfTeamsManaged, float hourlyRate) {
        super(id, age, name, nationality);
        this.department = department;
        this.numberOfTeamsManaged = numberOfTeamsManaged;
        this.hourlyRate = hourlyRate;
        department.addEmployee(this);
        developerCount++;
    }
    public static int getDeveloperCount() {
        return developerCount;
    }
    public void setNumberOfTeamsManaged(int numberOfTeamsManaged) {
        this.numberOfTeamsManaged = numberOfTeamsManaged;
    }
    public int getNumberOfTeamsManaged() {
        return numberOfTeamsManaged;
    }
    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public float getHourlyRate() {
        return hourlyRate;
    }
    @Override public float calculateSalary() {
        return numberOfTeamsManaged * hourlyRate * department.getBaseSalary(); 
    }
    @Override public void assignProject(String projectName) {
        this.assignedProject = projectName;
        System.out.println(getname() + " has been assigned to project: " + projectName);
    }
    @Override public String getAssignedProject() {
        return assignedProject;
    }
    @Override public void employeeDetails() {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Hourly Rate: " + getHourlyRate());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Teams Managed: " + getNumberOfTeamsManaged());
    }
    

}   
