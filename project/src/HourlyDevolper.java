public class HourlyDevolper extends Employee implements AssignProject {
    protected Department department;
    protected int numberOfHoursWorked;
    protected float hourlyRate;
    
    private static int developerCount = 0;


    public HourlyDevolper() {
    
    }
    public HourlyDevolper(int id, int age, String name, String nationality, Department department, int numberOfHoursWorked, float hourlyRate) {
        super(id, age, name, nationality);
        this.department = department;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
        department.addEmployee(this);
        developerCount++;
    }
    public int getDeveloperCount() {
        return developerCount;
    }
    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }


    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }
    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public float getHourlyRate() {
        return hourlyRate;
    }
  
    @Override public float calculateSalary() {
        return numberOfHoursWorked * hourlyRate;
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
        System.out.println("Number of Hours Worked: " + getNumberOfHoursWorked());
        System.out.println("Assigned Project: " + getAssignedProject());
        System.out.println("-----------------------------");
    }
}
