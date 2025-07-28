import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        while(true) {
            System.out.println("Welcome to the Company Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee Details");
            System.out.println("3. Assign Project");
            System.out.println("4. Promote Employee");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Logic to add employee
                    break;
                case 2:
                    // Logic to view employee details
                    break;
                case 3:
                    // Logic to assign project
                    break;
                case 4:
                    // Logic to promote employee
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
