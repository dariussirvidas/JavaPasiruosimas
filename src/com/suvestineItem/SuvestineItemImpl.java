package com.suvestineItem;

import java.util.Comparator;

public class SuvestineItemImpl implements SuvestineItem, Comparable {
    private String detale;
    private int pagamintasKiekis;
    private double suma;

    public SuvestineItemImpl(String detale, int pagamintasKiekis, double suma) {
        this.detale = detale;
        this.pagamintasKiekis = pagamintasKiekis;
        this.suma = suma;
    }

    @Override
    public String getDetale() {
        return detale;
    }

    @Override
    public int getPagamintasKiekis() {
        return pagamintasKiekis;
    }

    @Override
    public double getSuma() {
        return suma;
    }

    @Override
    public String toString() {
        return String.format("|%50s|%20d|%22f.2|", detale, pagamintasKiekis, suma);
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(SuvestineItemImpl::getPagamintasKiekis).reversed()
                .thenComparing(SuvestineItemImpl::getDetale).compare(this, (SuvestineItemImpl) o);
    }
}
