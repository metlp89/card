package card;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ATMTest {
    Card creditCard = new CreditCard("Peter Parker", new BigDecimal(1500));
    Card debitCard = new DebitCard("Bruce Wayne", new BigDecimal(2000));

    ATM creditCard1 = new ATM(creditCard);
    ATM debitCard1 = new ATM(debitCard);

    @Test
    public void add() {
        BigDecimal expected = creditCard1.add(new BigDecimal(100));
        BigDecimal actual = new BigDecimal(1600);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withdrawFromCard() throws InsufficientFundsException {
        BigDecimal expected = debitCard.withdrawFromCard(new BigDecimal(100));
        BigDecimal actual = new BigDecimal(1900);
        Assert.assertEquals(expected, actual);
    }
}