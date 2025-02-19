package lesson9.task2;

import java.util.Objects;

//Класс-наследник от Animal
public class Fish extends Animal {
    //Создание полей класса
    private final int quantityOfGillsArches;
    private final String colorOfScales;

    //Создание конструктора класса
    public Fish(int age, double weight, int quantityOfGillsArches, String colorOfScales) {
        super(age, weight);
        this.quantityOfGillsArches = quantityOfGillsArches;
        this.colorOfScales = colorOfScales;
    }

    //Реализация методов
    @Override
    public void move() {
        System.out.println("Рыба плавает");
    }

    public void swim() {
        System.out.println("Рыба быстро плывёт");
    }

    public int getGills() {
        return quantityOfGillsArches;
    }

    public String getColorOfScales() {
        return colorOfScales;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fish fish = (Fish) o;
        return quantityOfGillsArches == fish.quantityOfGillsArches && Objects.equals(colorOfScales, fish.colorOfScales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityOfGillsArches, colorOfScales);
    }

    @Override
    public String toString() {
        return "Рыба: " +
                "количество жаберных дуг - " + quantityOfGillsArches + '\'' +
                ", цвет чешуи - '" + colorOfScales + '\'';
    }
}
