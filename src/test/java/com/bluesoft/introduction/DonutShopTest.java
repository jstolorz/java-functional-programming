package com.bluesoft.introduction;


import com.bluesoft.common.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DonutShopTest {

    @Test
    public void testBuyDonuts(){
        CreditCard creditCard = new CreditCard();
        Tuple<List<Donut>, Payment> purches = DonutShop.buyDonats(5,creditCard);
        assertEquals(Donut.price * 5, purches._2.amount);
        assertEquals(creditCard,purches._2.creditCard);
    }



}