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
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Currency dollars = new Currency("dollars", "$");
        Money balance = new Money(dollars, 100);
        Money changeAmount = new Money(dollars, 10);
        Money changeAmount2 = new Money(dollars, 15);
        CheckingAccount myAccount = new CheckingAccount(balance);
        SavingsAccount myAccount2 = new SavingsAccount(balance);
        myAccount2.deposit(changeAmount);
        myAccount2.withdraw(changeAmount2);
        myAccount2.deposit(changeAmount2);
        myAccount2.withdraw(changeAmount);
        myAccount2.withdraw(changeAmount2);
        myAccount2.deposit(changeAmount);
        myAccount2.printHistory();
    }

}
