public class Interns extends Employee  {
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
}