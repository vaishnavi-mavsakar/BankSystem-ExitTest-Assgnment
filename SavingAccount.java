public class SavingAccount implements Account,UPI {
    private String accountNumber;
    private String accountName;
    private double balance;
    private double interestRate;

    public SavingAccount(String accountNumber, String accountName, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.interestRate = interestRate;
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
        System.out.println("Deposited " + amount + " to Saving Account: " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Saving Account: " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Saving Account: " + accountNumber);
        }
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of " + interest + " applied to Saving Account: " + accountNumber);
    }

    @Override
    public void displayDetails() {
        System.out.println("Saving Account - Account Number: " + accountNumber + ", Name: " + accountName + ", Balance: " + balance
        +"Interest rate: "+interestRate);
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

