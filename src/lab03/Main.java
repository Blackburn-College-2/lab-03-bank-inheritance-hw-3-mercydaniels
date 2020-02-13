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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Currency dollars = new Currency("dollars", "$");
        Money balance = new Money(dollars, 100);
        Money changeAmount = new Money(dollars, 10);
        Money changeAmount2 = new Money(dollars, 15);
        Account myAccount = new Account(balance);
        myAccount.deposit(changeAmount);
        myAccount.withdraw(changeAmount2);
        myAccount.deposit(changeAmount2);
        myAccount.withdraw(changeAmount);
        myAccount.withdraw(changeAmount2);
        myAccount.printHistory();
    }

}
