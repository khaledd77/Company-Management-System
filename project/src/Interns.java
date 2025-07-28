public class Interns extends Employee implements AssignProjects  {
    private String internshipDuration;
    private String mentorName;
    private int UniLevel;
    private static int internCount = 0;
    public Interns() {
        internCount++;
    }
    public Interns (String name , int id , int age , SEX sex , String nationality, String internshipDuration, String mentorName , int UniLevel, Department department)
    {
        super(name, id, age, sex, nationality);
        this.internshipDuration = internshipDuration;
        this.mentorName = mentorName;
        this.UniLevel = UniLevel;
        this.department = department;
        department.addEmployee(this);
        internCount++;
    }
    public static int getInternCount() {
        return internCount;
    }
    public void setInternshipDuration(String internshipDuration) {
        this.internshipDuration = internshipDuration;
    }
    public String getInternshipDuration() {
        return internshipDuration;
    }
    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }
    public String getMentorName() {
        return mentorName;
    }
    public void setUniLevel(int UniLevel) {
        this.UniLevel = UniLevel;
    }
    public int getUniLevel() {
        return UniLevel;
    }
    @Override public float calculateSalary() {
        return department.getBaseSalary() * 0.3f; 
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
        System.out.println("Internship Duration: " + getInternshipDuration());
        System.out.println("Mentor Name: " + getMentorName());
        System.out.println("University Level: " + getUniLevel());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Assigned Project: " + getAssignedProjects());
        System.out.println("-----------------------------");
    }
}