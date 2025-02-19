package lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример с типом данных char");
        char firstCharacter = 'Д';
        char secondCharacter = 'О';
        char thirdCharacter = 'М';
        char fourthCharacter = '!';
        char fivethCharacter = 'З';
        System.out.println("" + firstCharacter + secondCharacter + thirdCharacter);
        //процесс склеивания строк - конкатенация

        //\n - символ который позволяет отступить одну строку заменив пустой System.out.println()
        //= это приравнивание, например а = 5
        //== это сравнение, вопрос равно ли, например 10 == 5 (они не равны, значит false)
        //!= это сравнение, вопрос НЕ равно ли, например 10 != 5 (они не равны, значит true)

        System.out.println("\nПример рботы с типом данных boolean");
        boolean isEquals = 10 == 5;
        System.out.println(isEquals);

        double firstDouble = 1.5;
        double secondDouble = 1.5;
        System.out.println(firstDouble == secondDouble);
        System.out.println(67 != 87);

        //++ увеличение числа на 1 (в зависимости от расположения слева или справа от переменной увеличение выполнится
        // до чтения или после)

        System.out.println("\nМатематические операции с логическими операторами");
        int firstNumber = 10;
        int secondNumber = 12;
        System.out.println(++firstNumber);
        System.out.println(secondNumber++);
        System.out.println(--secondNumber);

        //% - показывает остаток от деления (16 % 3 = 15 целых и остаток от деления 1)

        System.out.println("\nПроверка числа на четность");
        int remain = 13 % 2;
        System.out.println("Остаток от деления 13 на 2: " + remain);
        boolean isEven = remain == 0;
        System.out.println("Число 13 четное: " + isEven);

        System.out.println("\nЗадача5. Есть 3 стороны треугольника. Нужно напечатать на консоль слово: Равнобедренный, " +
                "Равносторонний или Разносторонний, в зависимости от того, какой это треугольник");
        int a = 10;
        int b = 10;
        int c = 10;

        //&& двойной амперсант - это логический оператор "И", если в цепочке сравнений true && true && false,
        // хотя бы одно false, то результат false
        //if на вход () принимает результат выражения сравнения либо true, либо false. Если true, то заходим в if,
        // если false, то не заходим

        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

        System.out.println("\nНеобходимо вывести в консоль 10 раз словосочетание Привет, Мир!");
        for (int index = 0; index < 10; index++) {
            System.out.println("Привет, Мир!");
        }
        // && - и, || - или
        // < меньше
        // > больше
        //<= меньше или равно
        //>= больше или равно

        System.out.println("\nЗадача 6. Напечатать числа от 30 до 300, кратные 3 и 5, делятся без остатка на 3 и 5");
        for (int number = 30; number < 300; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Сколько денег мы вынесем из банка, если у нас уже есть 10 млн и мы будем печатать деньги " +
                "еще 15 дней, таким образом, что сумма будет увеличиваться ежедневно на 13 %");
        int money = 10_000_000;
        for (int day = 0; day < 15; day++) {
            money = money + (money / 100 * 13);
        }
        System.out.println("Мы вынесем из банка: " + money + " денег.");
    }
}