package pl.krakow.uek.pp5.jkan.creditcardapp.model;

import java.math.BigDecimal;

public class CreditCard {


    String cardNumber;
    private BigDecimal cardLimit;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;

    }




    public void AssignLimit(BigDecimal newLimit) {
        cardLimit  = newLimit;

    }

    public BigDecimal getLiit() {
        return cardLimit;
    }


    public void withdraw(BigDecimal valueOf) {
    }

    public BigDecimal getCurrentBalance() {
        return BigDecimal.valueOf(500);
    }

}