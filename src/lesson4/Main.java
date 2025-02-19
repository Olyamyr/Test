package lesson4;

public class Main {
    public static void main(String[] args) {
        int[] emptyArray = new int[10];

        System.out.println("Читаем значение пустого массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }

        System.out.println("Заполняем массив числами от 1 до 10");
        for (int index = 0; index < emptyArray.length; index++) {
            emptyArray[index] = index;
        }

        System.out.println("Читаем значение пустого массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }

        //Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}
        //1) Вывести на консоль массив с обратной стороны
        //2) Вывести на консоль те числа, которые содержат символ 5

        int[] numbersArray = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        System.out.println("\nВывести на консоль массив с обратной стороны");
        for (int index = numbersArray.length - 1; index >= 0; index--) {
            System.out.println(numbersArray[index]);
        }

        System.out.println("\nВывести на консоль те числа, которые содержат символ 5");
        for (int index = 0; index < numbersArray.length; index++) {
            int number = numbersArray[index];

            //преобразуем число в строку
            //Вариант 1 - через конкатенацию
            //String stringNumber = number + "";

            //Вариант 2 - через специальный метод
            String stringNumber = String.valueOf(number);
            if (stringNumber.contains("5")) {
                System.out.println(number);
            }
        }
        System.out.println("Создать  двумерный массив с числами и вывести на консоль");
        int[][] numbers = {
                {1, 2, 3},
                {3, 5, 6},
                {5, 3, 2},
                {1, 4, 5}
        };

        //nested - вложенный
        //Первым циклом идем по ячейкам основного массива (по этажам, по строкам и т.д.)
        for (int verticalIndex = 0; verticalIndex < numbers.length; verticalIndex++) {
            //Получаем содержимое каждой ячейки и записываем в переменную
            int[] nestedArrray = numbers[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArrray.length; horizontalIndex++) {
                //Достаем элемент и пишем в переменную
                int number = nestedArrray[horizontalIndex];
                //Выводим значение в консоль
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println("\nСоздать массив чисел и вывести его диагональ");
        int[][] array = {
                {1, 6, 4, 6, 7, 5},
                {43, 36, 654, 1, 23, 44},
                {5, 98, 54, 23, 98, 98},
                {7, 70, 57, 98, 79, 300},
                {12, 20, 92, 55, 87, 123},
                {6, 66, 45, 876, 91, 56},
        };

        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex + horizontalIndex == 5) {
                    //Либо обращаемся к основному массиву и указываем координаты ячейки по вертикали и горизонтали
                    // для получения содержимого int number = array[verticalIndex][horizontalIndex];
                    //Либо обращаемся к уже полученному вложенному массиву и сразу получаем содержимое из ячейки по диагонали
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        //Запись значений в ячейку массива происходит по схеме
        //1) Получили ячейку массива
        //2) Записали туда данные

        //Запись в ячейку массива
        //название Массива[индекс ячейки] = значение -> numbers[4] = 15

        //Чтение/получение из ячейки массива
        //название Массива[индекс ячейки] = значение -> numbers[4]

        //Запись в ячейку двумерного массива
        //название Массива[индекс ячейки по вертикали][индекс ячейки по горизонтали] = значение -> numbers[4][5] = 15;

        //Чтение/получение из ячейки двумерного массива
        //название Массива[индекс ячейки по вертикали][индекс ячейки по горизонтали] = значение -> numbers[4][5]

        System.out.println("Создать пустой массив и заполнить его значениями потом");
        int[][] simpleArray = new int[6][6];
        //Если хотим наполнить вручную
        simpleArray[0][0] = 1;
        simpleArray[0][1] = 2;
        simpleArray[3][2] = 4;

        //Если циклом (for)
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                simpleArray[verticalIndex][horizontalIndex] = 15;
            }
        }
    }
}