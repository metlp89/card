package card;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(String cardHolderName, BigDecimal accountBalance) {
        super(cardHolderName, accountBalance);
    }

    public CreditCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public BigDecimal withdrawFromCard(BigDecimal money)  {
        return accountBalance.subtract(money);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}


