

public class CheckingAccount extends BankAccount{
    
    private double FEE = 0.15;
    private String accNum;

    public CheckingAccount(String name, int initialAmount) {
        super(name, initialAmount);
        this.accNum = this.getAccountNumber()+"-10";
        this.setAccountNumber(this.accNum);
    }

    @Override
    public boolean withdraw(double amount)
    {
        if (amount > getBalance())
            return false;
        if (this.getBalance() <  amount + this.FEE)
            return false;
        
        return super.withdraw(amount+this.FEE); 
    }


}
