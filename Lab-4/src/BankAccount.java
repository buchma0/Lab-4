public class BankAccount {

    private double balance;
    private final String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static class Program {
        public static void main(String[] args) {
            System.out.println("\tBank Account");

            // Create a bank account instance
            BankAccount account = new BankAccount("1", 1000.0);
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Initial balance: " + account.getBalance());

            // 1. Test deposit with a negative amount
            account.deposit(-200.0);
            System.out.println("Balance after trying to deposit -200: " + account.getBalance()); // Remains 1000.0

            // 2. Test withdraw with an amount exceeding the balance
            account.withdraw(1500.0); // Prints "Insufficient funds"

            // 3. Successful withdrawal
            account.withdraw(300.0);
            System.out.println("Balance after withdrawing 300: " + account.getBalance()); // Becomes 700.0

            // The accountNumber field is final, it cannot be changed after account creation
        }
    }
}
