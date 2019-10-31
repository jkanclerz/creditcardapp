package pl.krakow.uek.pp5.jkan.creditcardapp.model;

import pl.krakow.uek.pp5.jkan.creditcardapp.model.exceptions.CreditBelowMinimumValueException;

import java.math.BigDecimal;

public class CreditCard {
    private String cardNumber;
    private BigDecimal creditLimit;
    private BigDecimal cardBalance;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void assignLimit(BigDecimal newLimit) {
        if(BigDecimal.valueOf(100).compareTo(newLimit) == 1) {
            throw new CreditBelowMinimumValueException();
        }
        this.creditLimit = newLimit;
        this.cardBalance = creditLimit;
    }

    public BigDecimal getLimit() {
        return creditLimit;
    }

    public void withdraw(BigDecimal money) {
        cardBalance = cardBalance.subtract(money);
    }

    public BigDecimal currentBalance() {
        return cardBalance;
    }
}
