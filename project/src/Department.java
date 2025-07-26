import java.util.ArrayList;
public class Department {
    
    protected String departmentName;
    protected int departmentId;
    protected String departmentHead;
    protected int baseSalary;
    private ArrayList<Employee> employees= new ArrayList<>();

    public Department() {
    }
    public Department(String departmentName, int departmentId, String departmentHead , int baseSalary) {
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.departmentHead = departmentHead;
        this.baseSalary = baseSalary;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }
    public String getDepartmentHead() {
        return departmentHead;
    }
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setDepartmentName(String name) {
        this.departmentName = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    public void displayDepartmentEmployees() {
       System.out.println("Employees in " + departmentName + " Department : ");
       for(Employee e : employees)
       {
         e.employeeDetails();
         System.out.println("-----------------------------");
       }
    }

}
