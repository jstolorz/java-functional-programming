package com.bluesoft.introduction;

public class CreditCard {
    private int total;

    public void charge(int price){
        this.total += price;
    }

    public int getTotal(){
        return total;
    }
}
