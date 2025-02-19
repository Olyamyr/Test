package lesson9.task1;

public class Main {
    public static void main(String[] args) {
        //Создание объектов
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(8, 4);
        Shape triangle = new Triangle(5, 10);

        //Вычисление площадей фигур
        System.out.println("Площадь круга = " + circle.calculateArea());
        System.out.println("Площадь прямоугольника = " + rectangle.calculateArea());
        System.out.println("Площадь треугольника = " + triangle.calculateArea());
    }
}