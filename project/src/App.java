import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class App {

    public static void main(String[] args)  {
        System.out.println("Welcome to the Company Management System");
        Map<String, Department> departments = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            
            System.out.println("1. Add Employee");
            System.out.println("2. View Department Employees Details");
            System.out.println("3. Assign Project");
            System.out.println("4. Promote Employee");
            System.out.println("5. Exit");

            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Adding a new employee...");
                    System.out.println("Please enter the type of employee :");
                    System.out.println("1. Manager");
                    System.out.println("2. Developer");
                    System.out.println("3. Intern");
                    System.out.println("4. Hourly Developer");
                    String employeeType = scanner.next();

                    if(employeeType.equals("1") || employeeType.equals("Manager")){
                    
                        System.out.println("Enter Manager Name: ");
                        String managerName = scanner.next();
                        System.out.println("Enter Manager ID: ");
                        int managerId = scanner.nextInt();
                        System.out.println("Enter Manager Age: ");
                        int managerAge = scanner.nextInt();
                        System.out.println("Enter the Department name : ");
                        String departmentNameInput = scanner.next();
                        String departmentName = departmentNameInput.toUpperCase(); 
                        Department department;

                        if (departments.containsKey(departmentName)) {
                             department = departments.get(departmentName);
                        } 
                        else {
                             System.out.println("Enter the Department Base Salary : ");
                             int baseSalary = scanner.nextInt();
                             department = new Department(departmentName, baseSalary);
                             departments.put(departmentName, department);
                         }

                        System.out.println("Enter Manager Gender (Male/Female) : ");
                        String managerSexInput = scanner.next();
                        Employee.SEX managerSex;
                        if (managerSexInput.equalsIgnoreCase("Male")) {
                            managerSex = Employee.SEX.Male;
                        } else if (managerSexInput.equalsIgnoreCase("Female")) {
                            managerSex = Employee.SEX.Female;
                        } else {
                            System.out.println("Invalid gender input, defaulting to Male.");
                            managerSex = Employee.SEX.Male;
                        }
                        System.out.println("Enter Manager Nationality: ");
                        String managerNationality = scanner.next();
                        System.out.println("Enter Manager Number of Teams Managed: ");
                        int numberOfTeamsManaged = scanner.nextInt();
                        Manager manager = new Manager(managerName, managerId, managerAge, managerSex, managerNationality,department, numberOfTeamsManaged );

                        System.out.println("Manager added successfully.");

                    } else if(employeeType.equals("2") || employeeType.equals("Developer")) {
                        System.out.println("Enter Developer Name: ");
                        String DeveloperName = scanner.next();
                        System.out.println("Enter Developer ID: ");
                        int DeveloperId = scanner.nextInt();
                        System.out.println("Enter Developer Age: ");
                        int DeveloperAge = scanner.nextInt();
                        System.out.println("Enter Developer Gender (Male/Female) : ");
                        String DeveloperSexInput = scanner.next();
                        Employee.SEX DeveloperSex;
                        if (DeveloperSexInput.equalsIgnoreCase("Male")) {
                            DeveloperSex = Employee.SEX.Male;
                        } else if (DeveloperSexInput.equalsIgnoreCase("Female")) {
                            DeveloperSex = Employee.SEX.Female;
                        } else {
                            System.out.println("Invalid gender input, defaulting to Male.");
                            DeveloperSex = Employee.SEX.Male;
                        }
                        System.out.println("Enter Developer Nationality: ");
                        String DeveloperNationality = scanner.next();
                        System.out.println("Enter the Department name : ");
                        String departmentNameInput = scanner.next();
                        String departmentName = departmentNameInput.toUpperCase(); 
                        Department department;

                        if (departments.containsKey(departmentName)) {
                             department = departments.get(departmentName);
                        } 
                        else {
                             System.out.println("Enter the Department Base Salary : ");
                             int baseSalary = scanner.nextInt();
                             department = new Department(departmentName, baseSalary);
                             departments.put(departmentName, department);
                         }

                        
                        Developer developer = new Developer(DeveloperName, DeveloperId, DeveloperAge, DeveloperSex, DeveloperNationality,department );

                        System.out.println("Developer added successfully.");


                    } else if(employeeType.equals("3") || employeeType.equals("Intern")) {
                         System.out.println("Enter Intern Name: ");
                        String InternName = scanner.next();
                        System.out.println("Enter Intern ID: ");
                        int InternId = scanner.nextInt();
                        System.out.println("Enter Intern Age: ");
                        int InternAge = scanner.nextInt();
                        System.out.println("Enter Intern Gender (Male/Female) : ");
                        String InternSexInput = scanner.next();
                        Employee.SEX InternSex;
                        if (InternSexInput.equalsIgnoreCase("Male")) {
                            InternSex = Employee.SEX.Male;
                        } else if (InternSexInput.equalsIgnoreCase("Female")) {
                            InternSex = Employee.SEX.Female;
                        } else {
                            System.out.println("Invalid gender input, defaulting to Male.");
                            InternSex = Employee.SEX.Male;
                        }
                        System.out.println("Enter Intern Nationality: ");
                        String InternNationality = scanner.next();
                        System.out.println("Enter the internship duration : ");
                        int InternshipDuration = scanner.nextInt();
                        System.out.println("Enter Mentor Name : ");
                        String MentorName = scanner.next();
                        System.out.println("Enter Uni level : ");
                        int UniLevel = scanner.nextInt();
                        System.out.println("Enter the Department name : ");
                        String departmentNameInput = scanner.next();
                        String departmentName = departmentNameInput.toUpperCase(); 
                        Department department;

                        if (departments.containsKey(departmentName)) {
                             department = departments.get(departmentName);
                        } 
                        else {
                             System.out.println("Enter the Department Base Salary : ");
                             int baseSalary = scanner.nextInt();
                             department = new Department(departmentName, baseSalary);
                             departments.put(departmentName, department);
                         }

                        
                        Intern intern = new Intern(InternName, InternId, InternAge, InternSex, InternNationality,InternshipDuration ,MentorName  , UniLevel , department );

                        System.out.println("Intern added successfully.");


                    } else if(employeeType.equals("4") || employeeType.equals("Hourly Developer")) {
                        System.out.println("Enter HourlyDeveloper Name: ");
                        String HourlyDeveloperName = scanner.next();
                        System.out.println("Enter HourlyDeveloper ID: ");
                        int HourlyDeveloperId = scanner.nextInt();
                        System.out.println("Enter HourlyDeveloper Age: ");
                        int HourlyDeveloperAge = scanner.nextInt();
                        System.out.println("Enter HourlyDeveloper Gender (Male/Female) : ");
                        String HourlyDeveloperSexInput = scanner.next();
                        Employee.SEX HourlyDeveloperSex;
                        if (HourlyDeveloperSexInput.equalsIgnoreCase("Male")) {
                            HourlyDeveloperSex = Employee.SEX.Male;
                        } else if (HourlyDeveloperSexInput.equalsIgnoreCase("Female")) {
                            HourlyDeveloperSex = Employee.SEX.Female;
                        } else {
                            System.out.println("Invalid gender input, defaulting to Male.");
                            HourlyDeveloperSex = Employee.SEX.Male;
                        }
                        System.out.println("Enter HourlyDeveloper Nationality: ");
                        String HourlyDeveloperNationality = scanner.next();
                        System.out.println("Enter number of hours : ");
                        int numbofHours = scanner.nextInt();
                        System.out.println("Enter the hourly rate : ");
                        int hourRate = scanner.nextInt();
                        System.out.println("Enter the Department name : ");
                        String departmentNameInput = scanner.next();
                        String departmentName = departmentNameInput.toUpperCase(); 
                        Department department;

                        if (departments.containsKey(departmentName)) {
                             department = departments.get(departmentName);
                        } 
                        else {
                             System.out.println("Enter the Department Base Salary : ");
                             int baseSalary = scanner.nextInt();
                             department = new Department(departmentName, baseSalary);
                             departments.put(departmentName, department);
                         }

                        
                        HourlyDeveloper Hourlydeveloper = new HourlyDeveloper(HourlyDeveloperName, HourlyDeveloperId, HourlyDeveloperAge, HourlyDeveloperSex, HourlyDeveloperNationality,department , numbofHours , hourRate );

                        System.out.println("HourlyDeveloper added successfully.");


                    } else {
                        System.out.println("Invalid employee type selected.");
                    }
                    break;
                case 2:
                
                   if(departments.isEmpty()){
                    System.out.println("There's no employees in this department ");
                   }
                   else{
                    for(Map.Entry<String, Department> entry : departments.entrySet())
                    {
                        
                        
                        entry.getValue().displayDepartmentEmployees();  
                    }
                    }
                   
    
                break;

                    
                case 3:
                    System.out.println("Please enter the name , id and the department of the employee you want to assign project to : ");
                    String nameEmp = scanner.next();
                    int empId = scanner.nextInt();
                    String departName = scanner.next();
                    
                    for(Map.Entry<String, Department> entry : departments.entrySet())
                    {
                        if(departName.equalsIgnoreCase(entry.getValue().departmentName))
                        {
                              for(Employee e : entry.getValue().employees)
                              {
                                   if(e.name.equalsIgnoreCase(nameEmp) && e.id == empId)
                                   {
                                        System.out.println("Please enter the name of the project : ");
                                        String projectName = scanner.next();
                                        if (e instanceof AssignProjects) {
                                            ((AssignProjects) e).assignProjects(projectName);
                                        } else {
                                            System.out.println("This employee type cannot be promoted.");
                                        }
                                   }
                              }
       
                        }
                        
                          
                    }
                    break;
                case 4:
                    System.out.println("Please enter the name and the department of the employee you want to promote : ");
                    String nameString = scanner.next();
                    String deptName = scanner.next();
                    for(Map.Entry<String, Department> entry : departments.entrySet())
                    {
                        if(deptName.equalsIgnoreCase(entry.getValue().departmentName))
                        {
                              for(Employee e : entry.getValue().employees)
                              {
                                   if(e.name.equalsIgnoreCase(nameString))
                                   {
                                        System.out.println("Enter the new title : ");
                                        String newTitle = scanner.next();
                                        System.out.println("Enter the bonus salary : ");
                                        int bonusSalary = scanner.nextInt();
                                        if (e instanceof Promote) {
                                            ((Promote) e).promotion(newTitle, bonusSalary);
                                        } else {
                                            System.out.println("This employee type cannot be promoted.");
                                        }
                                   }
                              }
       
                        }
                        
                          
                    }
                    

                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
       
        
    }
}
