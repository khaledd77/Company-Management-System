public class Developer extends Employee implements AssignProjects {

    private static int developerCount = 0;
    
    public Developer()
    {
        developerCount++;
    }
    public Developer(String name , int id , int age , SEX sex , String nationality,  Department department) 
    {
        super(name, id, age, sex, nationality);
        this.department = department;
        department.addEmployee(this);
        developerCount++;
        
    }
    public static int getDeveloperCount() {
        return developerCount;
    }
    
    @Override public float calculateSalary() {
        return department.getBaseSalary()*assignedProjectsCount;
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
    @Override public void employeeDetails()
    {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Projects: " + assignedProjectsCount);
        System.out.println("Assigned Project: " + getAssignedProjects());
        System.out.println("-----------------------------");
    }
}
