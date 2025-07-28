public class Manager extends Employee implements AssignProjects , Promote {
    
    private int numberOfTeamsManaged;
    private String title="Manager";
    private float bonus=1.f;
    private static int developerCount = 0;


    public Manager() {
        developerCount++;
    }
    public Manager(String name , int id , int age , SEX sex , String nationality, Department department, int numberOfTeamsManaged) {
        super(name, id, age, sex, nationality);
        this.department = department;
        this.numberOfTeamsManaged = numberOfTeamsManaged;
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
    @Override public float calculateSalary() {
        return numberOfTeamsManaged * department.getBaseSalary() * 1.5f * bonus; 
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
    @Override public void promotion(String title , float bonus)
    {
        this.title=title;
        this.bonus=bonus;
        System.out.println(getName() + " has been promoted to " + title + " with a bonus of " + bonus);
    }
    @Override public String getTitle() {
        return title;
    }
    @Override public void employeeDetails() {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Title: " + getTitle());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Assigned Projects: " + getAssignedProjects());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Teams Managed: " + getNumberOfTeamsManaged());
        System.out.println("-----------------------------");
    }
    

}   
