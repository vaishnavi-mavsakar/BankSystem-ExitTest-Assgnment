public class CurrentAccount implements Account,UPI {
    private String accountNumber;
    private String accountName;
    private double balance;

    public CurrentAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account: " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account: " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Current Account: " + accountNumber);
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Current Account - Account Number: " + accountNumber + ", Name: " + accountName + ", Balance: " + balance);
    }


    @Override
    public void pay(String toAccount, Double amount) {
        if (amount<=balance){
            balance=balance-amount;
            System.out.println("Paid "+amount +"to account "+toAccount +"New balance "+balance);
        }else{
            System.out.println("Insufficient balance for payments");
        }
    }

    @Override
    public void recieve(String formAccount, Double amount) {
        balance=balance+amount;
        System.out.println("Recieved amount "+ amount +"Form an account "+ formAccount +"new balance "+balance);

    }
}

