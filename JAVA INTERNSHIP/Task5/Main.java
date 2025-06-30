import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Rasika Pawar", "ACC12345", 1000.0, 5.0);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest");
            System.out.println("4. View Balance");
            System.out.println("5. Transaction History");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.addInterest();
                    break;
                case 4:
                    acc.displayBalance();
                    break;
                case 5:
                    acc.printTransactionHistory();
                    break;
                case 0:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);

        sc.close();
    }
}
