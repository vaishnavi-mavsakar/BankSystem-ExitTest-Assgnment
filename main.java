import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new SavingAccount("123","saving",500,3));
        bank.addAccount(new SavingAccount("124","saving1",1000,4));
        bank.addAccount(new SavingAccount("125","saving2",2000,3));
        bank.addAccount(new SavingAccount("126","saving3",3000,2));
        bank.viewAllAccounts();
        bank.deposit("123",500);
        bank.findAccount("123");
        //bank.deposit("123123",400);
        ArrayList list=new ArrayList();
        list.add(bank);
        Backup backup=new Backup(list);




    }}