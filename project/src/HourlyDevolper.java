public class HourlyDevolper extends Employee {
    protected Department department;
    protected int numberOfHoursWorked;
    protected float hourlyRate;

    public HourlyDevolper() {
    
    }
    public HourlyDevolper(int id, int age, String name, String nationality, Department department, int numberOfHoursWorked, float hourlyRate) {
        super(id, age, name, nationality);
        this.department = department;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
        department.addEmployee(this);
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
    @Override public void employeeDetails() {
        super.employeeDetails();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Base Salary: " + department.getBaseSalary());
        System.out.println("Hourly Rate: " + getHourlyRate());
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("Number of Hours Worked: " + getNumberOfHoursWorked());
    }
}
