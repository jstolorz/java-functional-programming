package com.bluesoft.javvainaction.chap02;

public class Apple {
    private int weight = 0;
    private Color color;

    public Apple(final int weight, final Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Apple() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
