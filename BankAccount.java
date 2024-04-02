public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void Deposit(double depositSum) {
        this.balance += depositSum;
    }

    public void Withdraw(double withdrawSum) {
        this.balance -= withdrawSum;
    }    

    public double getBalance() {
        return balance;
    }
}
