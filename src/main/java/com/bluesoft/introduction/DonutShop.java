package com.bluesoft.introduction;

import com.bluesoft.common.List;

import static com.bluesoft.common.List.fill;


public class DonutShop {

    public static Tuple<Donut,Payment> byDonat(CreditCard creditCard){
        return new Tuple<>(new Donut(), new Payment(creditCard,Donut.price));
    }

    public static Tuple<List<Donut>,Payment> buyDonats(final int quantity, final CreditCard creditCard) {
        return new Tuple<>(fill(quantity, Donut::new), new Payment(creditCard, Donut.price * quantity));
    }
}
