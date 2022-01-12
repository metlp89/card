package card;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Card {
    protected String cardHolderName;
    protected BigDecimal accountBalance;

    public Card(String cardHolderName, BigDecimal accountBalance) {
        this.cardHolderName = cardHolderName;
        this.accountBalance = accountBalance;
    }

    public Card(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BigDecimal add(BigDecimal money) {
        return accountBalance.add(money);
    }

    public BigDecimal withdrawFromCard(BigDecimal money) throws InsufficientFundsException {
        return accountBalance.subtract(money);
    }


    public BigDecimal convertCurrency(BigDecimal conversionRate) {
        return accountBalance.multiply(conversionRate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardHolderName, card.cardHolderName) && Objects.equals(accountBalance, card.accountBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardHolderName, accountBalance);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
