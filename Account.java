public interface Account {
    String getAccountNumber();
    String getAccountName();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    void displayDetails();
}

