package com.bluesoft.javvainaction.chap02;

// concrete strategy

class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(final Apple apple) {
        return Color.RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
