package com.bluesoft.introduction;

public class Payment {
    public final CreditCard creditCard;
    public final int amount;

    public Payment(final CreditCard creditCard, final int amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public Payment combine(Payment payment){
        if(creditCard.equals(payment.creditCard)){
            return new Payment(creditCard, amount+ payment.amount);
        }else {
            throw new IllegalStateException(("Karty nie pasują do siebie"));
        }
    }
}
