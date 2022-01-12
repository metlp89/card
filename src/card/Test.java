package card;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Card creditCard = new CreditCard("Peter Parker", new BigDecimal(1500));
        Card debitCard = new DebitCard("Bruce Wayne", new BigDecimal(2000));

        // troubles with these two methods
        //creditCard.withdrawFromCard(new BigDecimal(1500));
        //debitCard.withdrawFromCard(new BigDecimal(2000));

        ATM creditCard1 = new ATM(creditCard);
        ATM debitCard1 = new ATM(debitCard);
        System.out.println(creditCard1.withdrawFromCard(new BigDecimal(3000)));
        System.out.println(debitCard1.withdrawFromCard(new BigDecimal(2500)));
    }
}
