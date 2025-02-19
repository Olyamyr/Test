package lesson3;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("1. Вывести на консоль числа от 10 до 50, кроме чисел с 34 до 45");
        for (int number = 10; number < 50; number++) {
            if (number >= 34 && number <= 45) {
                continue;
            }
            System.out.println(number);
        }

        //Задача 2
        System.out.println("\n2. Вывести все номера кабинтов ВУЗа, при условии, " +
                "что там 6 этажей и на каждом по 9 кабинетов. Как только дойдем до 45 кабинета, " +
                "перестать выводить кабинеты на этом этаже.");
        for (int floor = 1; floor <= 6; floor++) {
            for (int numberOfCabinet = 1; numberOfCabinet <= 9; numberOfCabinet++) {
                if (floor == 4 && numberOfCabinet == 5) {
                    break;
                    //return
                }
                System.out.println("Кабинет №: " + floor + numberOfCabinet);
            }
        }
        //Задача 3
        System.out.println("\n3. Создадим пустой массив на 11 элементов");
        int[] intNumbers = new int[11];
        boolean[] booleansValues = new boolean[11];
        System.out.println(intNumbers);
        System.out.println("Длина массива: " + intNumbers.length);

        //Задача 4
        System.out.println("\n4. Создадим массив чисел и выведем их значение по порядку, а затем в обратном порядке.");
        //создаем массив
        double[] doubleNumbers = {1.1, 4.5, 3.54, 7.53, 2.65, 8.53};
        System.out.println("Вывод чисел по порядку расположения в массиве");
        for (int index = 0; index < doubleNumbers.length; index++) {
            //получаем элемент массива и записываем в переменную
            double number = doubleNumbers[index];
            //далее полученный результат выведем в консоль
            System.out.println(number);
        }
        System.out.println("Вывод чисел по порядку обратному расположения в массиве");
        for (int index = doubleNumbers.length - 1; index >= 0; index--) {
            //получаем элемент массива и записываем в переменную
            double number = doubleNumbers[index];
            //далее полученный результат выведем в консоль
            System.out.println(number);
        }
        //Задача 5
        //% - остаток от деления
        System.out.println("Вывести все четные числа из массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < numbers.length; index++) {
            //Получаем число из массива
            int number = numbers[index];
            //Если его остаток от деления 0, то оно четное и выводим
            if (numbers[index] % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}