public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, String number, double initialBalance, double interestRate) {
        super(name, number, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        transactionHistory.add("Interest added: ₹" + interest);
        System.out.println("Interest ₹" + interest + " added to your account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance - 100) {
            balance -= amount;
            transactionHistory.add("Withdrawn from savings: ₹" + amount);
            System.out.println("Withdrawn ₹" + amount + " from savings.");
        } else {
            System.out.println("Insufficient balance or minimum balance rule violated.");
        }
    }
}
