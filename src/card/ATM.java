package card;

import java.math.BigDecimal;
import java.util.Objects;

public class ATM {
    Card card;

    public ATM(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BigDecimal add(BigDecimal money) {
        return card.add(money);
    }

    public BigDecimal withdrawFromCard(BigDecimal money) {
        try {
            return card.withdrawFromCard(money);
        } catch (InsufficientFundsException e) {
             e.printStackTrace();
        }
return card.accountBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return Objects.equals(card, atm.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card);
    }

    @Override
    public String toString() {
        return "ATM{" +
                "card=" + card +
                '}';
    }
}
