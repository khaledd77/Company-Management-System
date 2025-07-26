public class Interns extends Employee  {
    protected String internshipDuration;
    protected String mentorName;
    protected int UniLevel;
    protected Department department;
    public Interns() {
    }
    public Interns (int id , int age , String name , String internshipDuration, String mentorName , int UniLevel, Department department)
    {
        super(id,age,name);
        this.internshipDuration = internshipDuration;
        this.mentorName = mentorName;
        this.UniLevel = UniLevel;
        this.department = department;
        department.addEmployee(this);
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
        return department.getBaseSalary() * numberOfHoursWorked * 0.3f; 
    }
}