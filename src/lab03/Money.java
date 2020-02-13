
package lab03;

/**
 * Money class that takes type currency and an amount
 * @author mercy.daniels
 */
public class Money {

    public void setAmount(long amount) {
        this.amount = amount;
    }

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
    /**
     * returns the amount from Money as a string
     * @return amount as String
     */
    public String getAmountString() {
        return amount + "";
    }
    /**
     * used for withdrawals; subtracts the amount m from the balance
     * @param input money to be subtracted
     * @return subtractedAmount as Money
     */
    public Money subtract(Money input) {
        long newAmount = this.amount - input.getAmount();
        this.amount = newAmount;
        Money subtractedAmount = new Money(currency, newAmount);
        return subtractedAmount;
    }
/**
 * used for deposits; adds amount m to the balance
 * @param input money to be added
 * @return addedAmount as Money
 */
    public Money add(Money input) {
        long newAmount = this.amount + input.getAmount();
        this.amount = newAmount;
        Money addedAmount = new Money(currency, newAmount);
        return addedAmount;
    }

    public Money multiply(Money input) {
        long newAmount = this.amount * input.getAmount();
        this.amount = newAmount;
        Money productAmount = new Money (currency, newAmount);
        return productAmount;
    }
 /**
 * overrides toString to return the currency and the amount
 * @return string
 */
    @Override
    public String toString() {
        return "" + currency + amount;
    }
}
