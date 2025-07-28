public class Interns extends Employee implements AssignProject  {
    protected String internshipDuration;
    protected String mentorName;
    protected int UniLevel;
    protected Department department;
    private static int internCount = 0;
    public Interns() {
        internCount++;
    }
    public Interns (int id , int age , String name , String nationality, String internshipDuration, String mentorName , int UniLevel, Department department)
    {
        super(id,age,name,nationality);
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
        System.out.println("Internship Duration: " + getInternshipDuration());
        System.out.println("Mentor Name: " + getMentorName());
        System.out.println("University Level: " + getUniLevel());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Assigned Project: " + getAssignedProject());
        System.out.println("-----------------------------");
    }
}