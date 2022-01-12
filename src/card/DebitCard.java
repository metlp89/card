package card;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(String cardHolderName, BigDecimal accountBalance) {
        super(cardHolderName, accountBalance);
    }

    public DebitCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public BigDecimal withdrawFromCard(BigDecimal money) throws InsufficientFundsException {
        if (accountBalance.compareTo(money) >= 0) {
            return accountBalance.subtract(money);
        } else {
            throw new InsufficientFundsException("Недостаточно средств");
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
