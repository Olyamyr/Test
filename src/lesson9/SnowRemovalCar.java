package lesson9;

import java.util.Objects;

public class SnowRemovalCar extends Car {
    private boolean isHasLadle;

    public SnowRemovalCar(int quantityOfWheels, String color, String material, boolean isHasLadle) {
        super(quantityOfWheels, color, material);
        this.isHasLadle = isHasLadle;
    }

    @Override
    public void toMove() {
        if (isHasLadle) {
            System.out.println("Еду медленно и собираю снег ковшом");
        } else {
            System.out.println("Еду медленно за ковшом на базу");
        }

    }

    @Override
    public void toStayOnParking() {
        System.out.println("Стою в промзоне на территории жилищника");
    }

    public void toRemoveSnow() {
        System.out.println("Убираю снег, чтобы тротуар был чистым");
    }

    public boolean isHasLadle() {
        return isHasLadle;
    }

    public void setHasLadle(boolean hasLadle) {
        isHasLadle = hasLadle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SnowRemovalCar that = (SnowRemovalCar) o;
        return isHasLadle == that.isHasLadle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHasLadle);
    }

    @Override
    public String toString() {
        return "SnowRemovalCar{" +
                "isHasLadle=" + isHasLadle +
                '}';
    }
}
