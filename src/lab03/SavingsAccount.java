/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author mercy.daniels
 */
public class SavingsAccount extends Account{
    private long interestRate = 6;
    private Money balance;
    public SavingsAccount(Money balance) {
        super(balance);
        this.balance = balance;
    }
/**
 * gets interest rate for the savings account
 * @return interestRate as long
 */
    public long getInterestRate() {
        return interestRate;
    }
/**
 * sets the interest rate as so desired
 * @param interestRate rate to be set
 */
    public void setInterestRate(long interestRate) {
        this.interestRate = interestRate;
    }
  /**
   * sets the amount in balance to be multiplied by the interest 
   */
    public void accrue(){
       long amount =  balance.getAmount();
       amount = amount * interestRate;
       
    }

    @Override
    public void withdraw(Money m) {
        super.withdraw(m); 
        accrue();
    }
    
    
}
