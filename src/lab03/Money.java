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
public class Money {
    private Currency currency;
    private long amount;
    
    public Money(Currency currency, double amount){
        this.currency =currency;
       this.amount = (long) amount;
    }
     public long getAmount(){
         return amount;
     }
    public String getAmountString(){
        return "";
    }
    public Money subtract (Money input){
       long newAmount = amount - input.getAmount();
       Money subtractedAmount = new Money(currency, newAmount);
       return subtractedAmount;
    }
    public Money add(Money input){
        long newAmount = amount + input.getAmount();
       Money addedAmount = new Money(currency, newAmount);
       return addedAmount;
    }
    public String toString (){
        return "" + currency + amount;
    }
}
