package lesson9.task1;

import java.util.Objects;

//Класс-наследник от Shape
public class Circle extends Shape{
    //Создание поля класса
    private double radius;

    //Создание конструктора класса
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Реализация метода рассчета площади фигуры
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
