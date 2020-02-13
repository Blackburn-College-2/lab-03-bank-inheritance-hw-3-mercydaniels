/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Currency dollars = new Currency("dollars", "$");
        Money balance = new Money(dollars, 100);
        Money changeAmount = new Money(dollars, 10);
        Account myAccount = new Account(balance);
        myAccount.deposit(changeAmount);
        System.out.println(myAccount.toString());
        myAccount.withdraw(changeAmount);
        System.out.println(myAccount.toString());
    }

}
