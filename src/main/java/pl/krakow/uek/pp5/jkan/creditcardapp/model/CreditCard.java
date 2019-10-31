package pl.krakow.uek.pp5.jkan.creditcardapp.model;

import pl.krakow.uek.pp5.jkan.creditcardapp.model.exceptions.CreditBelowMinimumValueException;

import java.math.BigDecimal;

public class CreditCard {
    private String cardNumber;
    private BigDecimal creditLimit;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void assignLimit(BigDecimal newLimit) {
        if(BigDecimal.valueOf(100).compareTo(newLimit) == 1) {
            throw new CreditBelowMinimumValueException();
        }
        this.creditLimit = newLimit;
    }

    public BigDecimal getLimit() {
        return creditLimit;
    }

    public void withdraw(BigDecimal money) {

    }

    public BigDecimal currentBalance() {
        return null;
    }
}
