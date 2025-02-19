package lesson9.task2;

import java.util.Objects;

//Класс-наследник от Animal
public class Monkey extends Animal {
    //Создание поля класса
    private final String colorOfWool;

    //Создание конструктора класса
    public Monkey(int age, double weight, String colorOfWool) {
        super(age, weight);
        this.colorOfWool = colorOfWool;
    }

    //Реализация методов
    @Override
    public void move() {
        System.out.println("Обезьяна прыгает");
    }

    public void climbTree() {
        System.out.println("Обезьяна карабкается на дерево");
    }

    public String getColorOfWool() {
        return colorOfWool;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monkey monkey = (Monkey) o;
        return Objects.equals(colorOfWool, monkey.colorOfWool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colorOfWool);
    }

    @Override
    public String toString() {
        return "Обезьяна: " +
                "цвет шерсти - " + colorOfWool + '\'';
    }
}