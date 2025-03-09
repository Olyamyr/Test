package lesson17.HomeWork;

import java.util.Objects;

public class Coin {
    private double diameter;
    private int year;
    private double nominal;
    private String metal;

    public Coin(double diameter, int year, double nominal, String metal) {
        this.diameter = diameter;
        this.year = year;
        this.nominal = nominal;
        this.metal = metal;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getYear() {
        return year;
    }

    public double getNominal() {
        return nominal;
    }

    public String getMetal() {
        return metal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Double.compare(diameter, coin.diameter) == 0 && year == coin.year && Double.compare(nominal,
                coin.nominal) == 0 && Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, year, nominal, metal);
    }

    @Override
    public String toString() {
        return "Монета{" +
                "диаметр - " + diameter +
                ", год - " + year +
                ", металл - '" + metal + '\'' +
                ", номинал - " + nominal + '}';
    }
}
