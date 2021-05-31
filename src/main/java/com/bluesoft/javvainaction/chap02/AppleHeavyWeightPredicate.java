package com.bluesoft.javvainaction.chap02;

// concrete strategy

class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(final Apple apple) {
        return apple.getWeight() > 150;
    }
}
