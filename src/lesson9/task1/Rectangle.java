package lesson9.task1;

import java.util.Objects;

//Класс-наследник от Shape
public class Rectangle extends Shape {
    //Создание полей класса
    private double width;
    private double lenght;

    //Создание конструктора класса
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    //Реализация метода рассчета площади фигуры
    @Override
    public double calculateArea() {
        return width * lenght;
    }
}
