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
public class Loan extends Account{
    private Money loanAmount;
    private Money loanAmountBeforePay;
    public Loan(Money balance) {
        super(balance);
    }
/**
 * gets the loan amount
 * @return  loanAmount as Money
 */
    public Money getLoanAmount() {
        return loanAmount;
    }
    /**
     *  allows users to make a payment towards their loan
     * @param payment money to make the payment
     */
    public void makePayment (Money payment){
         long beforePayAmount = loanAmountBeforePay.getAmount();
         loanAmountBeforePay.setAmount(beforePayAmount + payment);
         
    }
    
    public boolean getLoanStatus(){
        if
    }
}
