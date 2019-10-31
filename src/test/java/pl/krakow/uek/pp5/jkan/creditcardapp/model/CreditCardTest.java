package pl.krakow.uek.pp5.jkan.creditcardapp.model;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import pl.krakow.uek.pp5.jkan.creditcardapp.model.exceptions.CreditBelowMinimumValueException;

public class CreditCardTest {
    public static final int NEW_CREDIT_LIMIT = 2000;

    @Test
    public void itAllowAssignLimitToCreditCard() {
        //Arrange // Given
        CreditCard card = new CreditCard("1234-5678");
        //Act // When
        card.assignLimit(BigDecimal.valueOf(NEW_CREDIT_LIMIT));
        //Assert // Them // Expect
        Assert.assertTrue(card.getLimit().equals(BigDecimal.valueOf(NEW_CREDIT_LIMIT)));

    }

    @Test
    public void itVerifyMinimumCreditValue() {

        CreditCard card = new CreditCard("1234-5678");

        try {
            card.assignLimit(BigDecimal.valueOf(50));
            Assert.fail("Excpetion should be thrown");
        } catch (CreditBelowMinimumValueException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void itVerifyMinimumCreditValueShouldBeGreaterThanBorderValue() {

        CreditCard card = new CreditCard("1234-5678");
        card.assignLimit(BigDecimal.valueOf(100));
        Assert.assertTrue(card.getLimit().equals(BigDecimal.valueOf(100)));
    }

    @Test
    public void withdrawFromCard() {
        //Arrange //Given
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5678");
        card1.assignLimit(BigDecimal.valueOf(1000));
        card2.assignLimit(BigDecimal.valueOf(1000));
        //Act //When
        card1.withdraw(BigDecimal.valueOf(500));
        card2.withdraw(BigDecimal.valueOf(200));
        //Assert //Then
        Assert.assertEquals(card1.currentBalance(), BigDecimal.valueOf(500));
        Assert.assertEquals(card2.currentBalance(), BigDecimal.valueOf(800));
    }


}