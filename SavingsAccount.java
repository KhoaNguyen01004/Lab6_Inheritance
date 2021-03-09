public class SavingsAccount extends BankAccount{
    
    private double rate = (2.5/100) ;
    private double savingsNumber = 0; 
    private String accountNumber;

    public SavingsAccount(String name, double initBalance)
    {
        super(name,initBalance);

        this.accountNumber = super.getAccountNumber();
        this.setAccountNumber(this.accountNumber);
    }
    
    public SavingsAccount(SavingsAccount yourAccount, double initBalance)
    {
        super(yourAccount, initBalance);
        this.savingsNumber++;
        this.accountNumber = super.getAccountNumber();
        this.setAccountNumber(this.accountNumber);
    }
    
    public void postInterest()
    {
        this.setBalance((this.getBalance()*this.rate) + this.getBalance());
    }

    @Override
    public String getAccountNumber()
    {
        return this.accountNumber + "-" + savingsNumber;
    }
}
