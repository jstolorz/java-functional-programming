package com.bluesoft;

import com.bluesoft.introduction.CreditCard;
import com.bluesoft.introduction.DonutShop;

public class MainApplication {


    public static void main(String[] args) {
        final CreditCard creditCard = new CreditCard();
        DonutShop.byDonat(creditCard);
    }


}
