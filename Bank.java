import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();
    private Backup backup;

    public Bank() {
        backup = new Backup(accounts);
        Thread backupThread = new Thread(backup);
        backupThread.start();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void transfer(String fromAccount, String toAccount, double amount) {
        Account sender = findAccount(fromAccount);
        Account receiver = findAccount(toAccount);
        if (sender != null && receiver != null) {
            if (sender.getBalance() >= amount) {
                sender.withdraw(amount);
                receiver.deposit(amount);
                System.out.println("Transferred " + amount + " from " + fromAccount + " to " + toAccount);
            } else {
                System.out.println("Insufficient balance in sender's account.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    public void viewAllAccounts() {
        for (Account account : accounts) {
            account.displayDetails();
        }
    }
    
}

