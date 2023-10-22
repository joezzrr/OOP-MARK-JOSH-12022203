import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> listAccount;

    public Bank() {
        listAccount = new ArrayList<>();
    }

    public void addAccount(Account Account){
        listAccount.add(Account);
    }

    public void removeAccount(String Name) {
        for (Account account : listAccount) {
            if (account.getName().equals(Name)) {
                listAccount.remove(account);
                
                System.out.println("Akun " + Name + " Telah Berhasil Dihapus!");
                System.out.println("---------------------------------------------------");
                return;
            }
        }
        
        System.out.println("Akun dengan " + Name + " tidak ditemukan");
        System.out.println("---------------------------------------------------");
        
    }

    public Account getAccount(String Name) {
        for (Account account : listAccount) {
            if (account.getName().equals(Name)) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> getAllAccounts() {
        return listAccount;
    }
}
