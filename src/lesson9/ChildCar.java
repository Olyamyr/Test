package lesson9;

import java.util.Objects;

public class ChildCar extends Car {
    private final boolean isHasControlPanel;

    public ChildCar(int quantityOfWheels, String color, String material, boolean isHasControlPanel) {
        super(quantityOfWheels, color, material);
        this.isHasControlPanel = isHasControlPanel;
    }

    @Override
    public void toMove() {
        if (isHasControlPanel) {
            System.out.println("Двигаюсь, когда нажимаются кнопки на пульте управления");
        } else {
            System.out.println("Двигаюсь, когда водитель оттакливается ногами");
        }
    }

    @Override
    public void toStayOnParking() {
        System.out.println("Стою на парковке в коридоре квартиры");
    }

    public void toPlayChildMusic() {
        System.out.println("Играют детские песни из российских мультфильмов");
    }

    public boolean isHasControlPanel() {
        return isHasControlPanel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChildCar childCar = (ChildCar) o;
        return isHasControlPanel == childCar.isHasControlPanel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHasControlPanel);
    }

    @Override
    public String toString() {
        return  "ChildCar{" +
                "isHasControlPanel=" + isHasControlPanel +
                '}';
    }
}
