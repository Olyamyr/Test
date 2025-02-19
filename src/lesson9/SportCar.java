package lesson9;

import java.util.Objects;

public class SportCar extends Car {
    private int enginePower;
    private final String typeOfTransmission;

    public SportCar(int quantityOfWheels, String color, String material, int enginePower, String typeOfTransmission) {
        super(quantityOfWheels, color, material);
        this.enginePower = enginePower;
        this.typeOfTransmission = typeOfTransmission;
    }

    @Override
    public void toMove() {
        System.out.println("Еду очень быстро и реву на всю улицу");
    }

    @Override
    public void toStayOnParking() {
        System.out.println("Стою на подземной парковке, под охраной, жду новой гонки");
    }

    public void toLaunchControl() {
        System.out.println("Повышаю обороты до 5 тысяч и уезжаю в даль");
    }

    public void toSpoilerUp() {
        System.out.println("Поднимаю спойлер для улучшения прижимной силы");
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return enginePower == sportCar.enginePower && Objects.equals(typeOfTransmission, sportCar.typeOfTransmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), enginePower, typeOfTransmission);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "enginePower=" + enginePower +
                ", typeOfTransmission='" + typeOfTransmission + '\'' +
                '}';
    }
}

