import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                dao.addEmployee(new Employee(name, email, salary));
            } else if (choice == 2) {
                dao.viewEmployees();
            } else if (choice == 3) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("New Name: ");
                String name = sc.nextLine();
                System.out.print("New Email: ");
                String email = sc.nextLine();
                System.out.print("New Salary: ");
                double salary = sc.nextDouble();
                dao.updateEmployee(new Employee(id, name, email, salary));
            } else if (choice == 4) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                dao.deleteEmployee(id);
            } else {
                System.out.println("Exiting...");
                break;
            }
        }

        sc.close();
    }
}