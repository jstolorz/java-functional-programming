package com.bluesoft.javvainaction.chap02;

class AppleOnlyWeightFormatter implements AppleFormatter {
    @Override
    public String accept(final Apple apple) {
        return apple.getWeight() + " gr.";
    }
}
