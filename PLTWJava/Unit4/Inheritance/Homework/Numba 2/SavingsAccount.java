public class SavingsAccount extends Account{
    protected double OVERDRAFT_LIMIT = 0;
    public SavingsAccount(){
        super();
    }
    public SavingsAccount(int id, double balance){
        super(id,balance);
    }
    @Override 
    public withdraw(double amount){
        if (balance-amount >= OVERDRAFT_LIMIT){
            super.withdraw(amount);
        }
    }
    @Override 
    public String toString(){
        return "Checking Acccount:"+id+"\nData Created:"+getDataCreated()+"\nBalance: $"+balance;
    }
}
