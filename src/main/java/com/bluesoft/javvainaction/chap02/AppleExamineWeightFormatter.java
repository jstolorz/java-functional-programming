package com.bluesoft.javvainaction.chap02;

class AppleExamineWeightFormatter implements AppleFormatter {
    @Override
    public String accept(final Apple apple) {
        return  apple.getWeight()  > 150 ? apple + " This apple is heavy": apple + " This apple is not heavy" ;
    }
}
