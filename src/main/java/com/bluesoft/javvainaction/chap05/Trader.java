package com.bluesoft.javvainaction.chap05;

import java.util.Objects;

class Trader {
    private String name;
    private String city;

    Trader(final String name, final String city) {
        this.name = name;
        this.city = city;
    }

    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }

    String getCity() {
        return city;
    }

    void setCity(final String city) {
        this.city = city;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Trader trader = (Trader) o;
        return Objects.equals(name, trader.name) && Objects.equals(city, trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
