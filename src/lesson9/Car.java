package lesson9;

import java.util.Objects;

public abstract class Car {
    private final int quantityOfWheels;
    private String color;
    private final String material;

    public Car(int quantityOfWheels, String color, String material) {
        this.quantityOfWheels = quantityOfWheels;
        this.color = color;
        this.material = material;
    }

    public abstract void toMove();

    public abstract void toStayOnParking();

    public int getQuantityOfWheels() {
        return quantityOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return quantityOfWheels == car.quantityOfWheels && Objects.equals(color, car.color) && Objects.equals(material, car.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityOfWheels, color, material);
    }

    @Override
    public String toString() {
        return "Car{" +
                "quantityOfWheels=" + quantityOfWheels +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
