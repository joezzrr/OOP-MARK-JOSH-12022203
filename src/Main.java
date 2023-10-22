import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Obos", "1323332312", 4200000);
        Account account2 = new Account("Markus", "3100230002", 325000);
        Account account3 = new Account("Joe_SI4607", "1202220368", 30000);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        ArrayList<Account> accounts = bank.getAllAccounts();
        for (Account account : accounts) {
            System.out.println("Saldo Akun " + account.getName() + ": " + account.getBalance());
        }

        System.out.println("---------------------------------------------------");

        account1.Deposit(500000);
        
        account2.Withdraw(120000);

        System.out.println("---------------------------------------------------");

        bank.removeAccount("Obos");

        System.out.println("Daftar semua akun dalam Bank:");
        ArrayList<Account> allAccounts = bank.getAllAccounts();
        for (Account account : allAccounts) {
            
            System.out.println("Nama: " + account.getName() + ", NIM: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        } 
    }
}
