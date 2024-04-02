public class SavingAccount extends BankAccount {
    
    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void Withdraw(double withdrawSum) {
        if (withdrawSum > getBalance() - 100) {
            System.out.println("Unable to withdraw - balance would be less than 100");
        } else {
            super.Withdraw(withdrawSum);
        }
    }    
}
