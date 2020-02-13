
package lab03;

/**
 * Money class that takes type currency and an amount
 * @author mercy.daniels
 */
public class Money {

    private Currency currency;
    private long amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = (long) amount;
    }
/**
 * gets the Amount value for money
 * @returns amount as long
 */
    public long getAmount() {
        return amount;
    }
    /**
     * Sets the amount to a negative value to 
     * add a withdrawal to the history ArrayList
     * @return amount as long
     */
    public long setAmountNeg() {
        return -amount;
    }
    public String getAmountString() {
        return amount + "";
    }

    public Money subtract(Money input) {
        long newAmount = this.amount - input.getAmount();
        this.amount = newAmount;
        Money subtractedAmount = new Money(currency, newAmount);
        return subtractedAmount;
    }

    public Money add(Money input) {
        long newAmount = this.amount + input.getAmount();
        this.amount = newAmount;
        Money addedAmount = new Money(currency, newAmount);
        return addedAmount;
    }

    public String toString() {
        return "" + currency + amount;
    }
}
