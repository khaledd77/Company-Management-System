public class HourlyDevolper extends Employee implements AssignProjects {
   
    private int numberOfHoursWorked;
    private float hourlyRate;
    private static int developerCount = 0;


    public HourlyDevolper() {
    
    }
    public HourlyDevolper(String name , int id , int age , SEX sex , String nationality, Department department, int numberOfHoursWorked, float hourlyRate) {
        super(name, id, age, sex, nationality);
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
    @Override public void assignProjects(String projectName) {
        
            assignedProjects.add(projectName);
            System.out.println(getName() + " has been assigned to project: " + projectName);
            assignedProjectsCount++;
       

    }
    @Override public String getAssignedProjects() {
        if(assignedProjects.isEmpty()){
            return "No Projects Assigned";
        }
        return String.join(", ", assignedProjects);
    }
    @Override public void employeeDetails() {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Hourly Rate: " + getHourlyRate());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Hours Worked: " + getNumberOfHoursWorked());
        System.out.println("Assigned Project: " + getAssignedProjects());
        System.out.println("-----------------------------");
    }
}
