package lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Считаем периметр треугольника со сторонами 1, 6, 9");
        int a = 1;
        int b = 6;
        int c = 9;
        MathUtils.countPerimeterOfTriangle(a, b, c);

        System.out.println("\nЗадача 2. Считаем площадь треугольника с основанием 1, и высотой 10");
        int h = 10; //Высота
        double area = MathUtils.countAreaOfTriangle(a, h);
        System.out.println(area);
    }
}