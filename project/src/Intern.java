public class Intern extends Employee implements AssignProjects , Promote  {
    private int internshipDuration;
    private String mentorName;
    private int UniLevel;
    private String title="Intern";
    private double bonus=0;
    private static int internCount = 0;
    public Intern() {
        internCount++;
    }
    public Intern (String name , int id , int age , SEX sex , String nationality, int internshipDuration, String mentorName , int UniLevel, Department department)
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
    public void setInternshipDuration(int internshipDuration) {
        this.internshipDuration = internshipDuration;
    }
    public int getInternshipDuration() {
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
    @Override public double calculateSalary() {
        return department.getBaseSalary() * 0.25f + bonus; 
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
    @Override public void promotion(String title , float Bonus) {
        this.title = title;
        this.bonus = Bonus;
        System.out.println(getName() + " has been promoted to " + title + " with a bonus of " + Bonus);
    }
    @Override public String getTitle() {
        return title;
    }
    @Override public void employeeDetails() {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Title: " + getTitle());
        System.out.println("Internship Duration: " + getInternshipDuration());
        System.out.println("Mentor Name: " + getMentorName());
        System.out.println("University Level: " + getUniLevel());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Assigned Project: " + getAssignedProjects());
      
    }
}