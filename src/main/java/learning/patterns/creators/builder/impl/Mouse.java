package learning.patterns.creators.builder.impl;

public class Mouse {
    private int DPI;
    private double weight;

    public Mouse(int DPI, double weight) {
        this.DPI = DPI;
        this.weight = weight;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "DPI=" + DPI +
                ", weight=" + weight +
                '}';
    }
}
