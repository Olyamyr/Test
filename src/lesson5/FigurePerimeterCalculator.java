package lesson5;

import java.util.Scanner;

/**
 * Калькулятор периметров фигур
 */
public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметр треугольника");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - овал");
        System.out.println("5 - круг");

        //У сканера есть режимы работы
        //System.in - читает из консоли
        //System.out - пишет в консоль

        //У сканера есть несколько способов чтения из консоли
        //nextInt() - читает int числа из консоли
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            MathUtils.countPerimeterOfTriangle(a, b, c);


            //Домашнее задание

        } else if (userChoice == 2) {
            System.out.println("Введите сторону n: ");
            int n = scanner.nextInt();

            MathUtils.countPerimeterOfSquare(n);
        } else if (userChoice == 3) {
            System.out.println("Введите длину l: ");
            int l = scanner.nextInt();

            System.out.println("Введите ширину w: ");
            int w = scanner.nextInt();

            MathUtils.countPerimeterOfTrapezoid(l, w);
        } else if (userChoice == 4) {
            System.out.println("Введите большую полуось e: ");
            int e = scanner.nextInt();

            System.out.println("Введите малую полуось k: ");
            int k = scanner.nextInt();

            MathUtils.countPerimeterOfOval(e, k);
        } else if (userChoice == 5) {
            System.out.println("Введите радиус r: ");
            int r = scanner.nextInt();

            MathUtils.countPerimeterOfCircle(r);
        }
    }

    //Домашнее задание
    //Дописать решение для остальных фигур
    //В классе MathUtils - ТОЛЬКО МАТЕМАТИКА В МЕТОДАХ,
    // запрос данных от пользователя и вывод результата в консоль в FigurePerimeterCalculator
}