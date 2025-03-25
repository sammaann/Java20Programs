class BankAccount {
    private double balance;

    // Default constructor: Initializes balance to 0
    public BankAccount() {
        this.balance = 0.0;
    }

    // Parameterized constructor: Allows user to set initial balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Using default constructor
        BankAccount acc1 = new BankAccount();
        System.out.println("Account 1 (Default Constructor):");
        acc1.displayBalance();

        // Using parameterized constructor
        BankAccount acc2 = new BankAccount(5000);
        System.out.println("\nAccount 2 (Parameterized Constructor):");
        acc2.displayBalance();

        acc2.deposit(2000);
        acc2.withdraw(1000);
        acc2.displayBalance();
    }
}
