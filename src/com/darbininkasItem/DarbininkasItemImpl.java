package com.darbininkasItem;

public class DarbininkasItemImpl implements DarbininkasItem {
    private String darbininkas;
    private String detale;
    private int detalesKiekis;
    private double detalesKaina;

    public DarbininkasItemImpl(String darbininkas, String detale, int detalesKiekis, double detalesKaina) {
        this.darbininkas = darbininkas;
        this.detale = detale;
        this.detalesKiekis = detalesKiekis;
        this.detalesKaina = detalesKaina;
    }

    @Override
    public String getDarbininkas() {
        return darbininkas;
    }

    @Override
    public String getDetale() {
        return detale;
    }

    @Override
    public int getDetalesKiekis() {
        return detalesKiekis;
    }

    @Override
    public double getDetalesKaina() {
        return detalesKaina;
    }

    @Override
    public String toString() {
        return String.format("|%50s|%50s|%20d|%22.2f|", darbininkas, detale, detalesKiekis, detalesKaina);
    }
}
