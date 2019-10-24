package pl.krakow.uek.pp5.jkan.creditcardapp.model;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

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
}