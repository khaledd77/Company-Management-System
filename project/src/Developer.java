import java.util.ArrayList;
public class Developer extends Employee implements AssignProject {

    private static int developerCount = 0;
    private int assignedProjectCount = 0;
    private ArrayList<String> assignedProjects = new ArrayList<>();
    
    public Developer()
    {
        developerCount++;
    }
    public Developer(int id , int age , String name , String nationality,  Department department) 
    {
        super(id,age,name,nationality);
        this.department = department;
        department.addEmployee(this);
        developerCount++;
        
    }
    public static int getDeveloperCount() {
        return developerCount;
    }
    
    @Override public float calculateSalary() {
        return department.getBaseSalary()*assignedProjectCount;
    }
    @Override public void assignProject(String projectName) {
        
            assignedProjects.add(projectName);
            System.out.println(getname() + " has been assigned to project: " + projectName);
            assignedProjectCount++;
       

    }
    @Override public String getAssignedProject() {
        if(assignedProjects.isEmpty()){
            return "No Projects Assigned";
        }
        return String.join(", ", assignedProjects);
    }
    @Override public void employeeDetails()
    {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Projects: " + assignedProjectCount);
        System.out.println("Assigned Project: " + getAssignedProject());
        System.out.println("-----------------------------");
    }
}
