public class Account {
    private String Name;
    private String AccountNumber;
    private double Balance;

    public String getName() {
        return Name;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public double getBalance() {
        return Balance;
    }
    public Account(String Name, String AccountNumber, double Balance) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    public void Deposit(double jumlah) {
        if (jumlah > 0) {
            Balance += jumlah;
            System.out.println("Saldo Akun " + getName() + " setelah menyetor: " + getBalance());
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0");
        }
    }
    public boolean Withdraw(double jumlah) {
        if (jumlah > 0 && Balance >= jumlah) {
            Balance -= jumlah;
            System.out.println("Saldo Akun "+ getName() + " setelah menarik uang: " + getBalance());
            return true;
        } else {
            System.out.println("Penarikan gagal, Saldo tidak cukup");
            return false;
        }
    }
}
