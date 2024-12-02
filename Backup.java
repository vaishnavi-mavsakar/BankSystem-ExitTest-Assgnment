import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Backup implements Runnable {
    private List<Account> accounts;

    public Backup(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void run() {
        while (true) {
            try {
                backupAccounts();
                Thread.sleep(10000); // Backup every 10 seconds
            } catch (InterruptedException e) {

            }
        }
    }

    private void backupAccounts() {
        try (FileWriter writer = new FileWriter("C:\\Users\\vaishnavi\\Documents\\demo1.java\\simple.bin")) {
            for (Account account : accounts) {
                writer.write(account.toString() + "\n");
            }
            System.out.println("Backup completed.");
        } catch (IOException e) {

        }
    }
}

