package lesson9.task1;

//Класс-наследник от Shape
public class Triangle extends Shape {
    //Создание полей класса
    private double base;
    private double height;

    //Создание конструктора класса
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Реализация метода рассчета площади фигуры
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
