package com.bluesoft.javvainaction.chap02;

class Apple {
    private int weight = 0;
    private Color color;

    Apple(final int weight, final Color color) {
        this.weight = weight;
        this.color = color;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(final int weight) {
        this.weight = weight;
    }

    Color getColor() {
        return color;
    }

    void setColor(final Color color) {
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
