package lesson3;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, " +
                "кроме 6, 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль " +
                "(достигнуто целевое число!).");
        //создаем массив
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index];
            {
                if (numbers[index] % 2 == 0) {
                    if (number == 6 || number == 10 || number == 14) {
                        continue;
                    }
                    if (number >= 23) {
                        break;
                    }
                    System.out.println(number);
                }
            }
        }
        System.out.println("достигнуто целевое число!");

        System.out.println("\nЗадача 2. Вывести предложение 'Я Java разработчик' наоборот (задом наперед) в одну строку");

        var word = "Я Java разработчик";
        var reversed = new StringBuilder(word)
                .reverse()
                .toString();
        System.out.println(reversed);

        String sentence = "Я Java разработчик";
        for (int index = sentence.length() - 1; index >= 0; index--) {
            System.out.print(sentence.charAt(index));

        }


        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, " +
                "кроме 6, 10, 14. Как только цикл дойдет до 23, остановить вывод и написать в консоль " +
                "(достигнуто целевое число!).");
        int[] numb = new int[30];

        //Наполняем массив числами (подготовка тестовых данных)
        for (int index = 0; index < numb.length; index++) {
            numb[index] = index + 1;
        }

        //Решение задачи
        for (int index = 1; index < numb.length; index++) {
            int num = numb[index];
            if (num == 23) {
                System.out.println("достигнуто целевое число!");
                break;
            }
            if (num % 2 == 0 && num != 6 && num != 10 && num != 14) {
                System.out.println(num);
            }
        }

        //Вариант с использованием метода toCharArray - строка переводится в массив, в котором буквы преобразуются в числа, а
        //затем массив выводится в обратном порядке
        System.out.println("\nЗадача 2. Вывести предложение 'Я Java разработчик' наоборот (задом наперед) в одну строку");
        String sentens = "Я Java разработчик";
        char[] reverseSentence = sentence.toCharArray();
        for (int index = reverseSentence.length - 1; index >= 0; index--) {
            System.out.print(reverseSentence[index]);
        }

        //Вариант с использованием метода StringBuffer()
        //Программа буферизует входную строку с использованием метода StringBuffer(), реверсирует буфер и затем
        //преобразует буфер в String с помощью метода toString()
        //метод reverse() разворачивает строку наоборот, метод toString() превращает обратно в строку
        String str = "Я Java разработчик";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}