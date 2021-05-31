package com.bluesoft.javvainaction.chap02;

// concrete strategy

class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(final Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
