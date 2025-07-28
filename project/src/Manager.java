public class Manager extends Employee implements AssignProjects {
    
    private int numberOfTeamsManaged;
    private float hourlyRate;
    private static int developerCount = 0;


    public Manager() {
        developerCount++;
    }
    public Manager(String name , int id , int age , SEX sex , String nationality, Department department, int numberOfTeamsManaged, float hourlyRate) {
        super(name, id, age, sex, nationality);
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
     @Override public void assignProjects(String projectName) {
        
            assignedProjects.add(projectName);
            System.out.println(getname() + " has been assigned to project: " + projectName);
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
        System.out.println("Assigned Projects: " + getAssignedProjects());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Teams Managed: " + getNumberOfTeamsManaged());
        System.out.println("-----------------------------");
    }
    

}   
