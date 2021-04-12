package com.company;

public class Gift {
    int quality ;
    int price;

    public Gift(int quality, int price) {
        this.quality = quality;
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Present{" +
                "quality=" + quality +
                ", price=" + price +
                '}';
    }
}
