package lesson1;

public class Main {
    public static void main(String[] args) {
        // - это способ оставить комментарий, не влияет на код, но можно записать полезную информацию
        // sout - короткая команда для генерации кода вывода в консоль
        // psvm - короткая команда для генерации точи старта
        // "" - в кавычках пишем текст
        // (тип данных к которому приводим), например (int) - прямое приведение, когда нам нужно один тип данных привести к другому

        System.out.println("Задача 1");
        System.out.println("Есть 3 стороны треугольникаб напечатать на консоль его периметр");

        //Дано
        int a = 129;
        int b = 4;
        int c = 9;

        //Решение
        int perimeter = a + b + c;

        //Вывод в консоль
        System.out.println("Периметр треугольника: " + perimeter);

        System.out.println();
        System.out.println("Задача 2");
        System.out.println("Есть ширина и длина стола, есть ширина и длина комнаты. Вывести на консоль, " +
                "сколько таких столов влезет в комнату?");

        //Дано
        double tableLength = 142.5;
        double tableWidth = 100.3;
        double roomLength = 1565.5;
        double roomWidth = 1000.5;

        //Решение
        double tableArea = tableLength * tableWidth;
        double roomArea = roomLength * roomWidth;

        int quantityOfTables = (int) (roomArea / tableArea);
        System.out.println("Ответ: " + quantityOfTables);
    }
}