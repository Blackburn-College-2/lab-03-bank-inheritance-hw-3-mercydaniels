
package lab03;

import java.util.ArrayList;

/**
 *
 * @author mercy.daniels
 */
public class Account {
    private Money balance;
    private ArrayList<Money> history = new ArrayList<Money>();
    
    public Account(Money balance){
        this.balance = balance;
        
    }
    /**
     * subtracts money from the account balance 
     * and adds that amount to the history ArrayList
     * @param m the money to be withdrawn
     */
    public void withdraw(Money m){
        balance.subtract(m);
        
        history.add(balance);
    }
    /**
     * adds money to the account balance 
     * and adds that amount as a negative Money to the history ArrayList
     * @param m the money to be Deposited
     */
    public void deposit (Money m){
        balance.add(m);
        balance.setAmountNeg();
        history.add(balance);
    }
    /**
     * gets the balance value
     * @return balance as Money
     */
    public Money getBalance(){
        return balance;
        
    }
   
    /**
     * 
     */
    public String toString(){
        return balance.getAmountString();
    }
    
    public void printHistory(){
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i).getAmountString());
        }
    }
}
