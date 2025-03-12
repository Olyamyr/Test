package lesson19.HomeWork.Consumer;

import java.util.Arrays;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 415, 38, -85, 1905, 1005, 1065, 5, null, 150, 1, 999);

        System.out.println("Выведем числа из списка");
        numbers.forEach(System.out::println);

        System.out.println("\nВыведем все числа больше 100 через Consumer");
        BigNumberConsumer bigNumberConsumer = new BigNumberConsumer();
        for (Integer number : numbers) {
            bigNumberConsumer.accept(number);
        }

        System.out.println("\nВыведем все числа больше 100 через forEach + Consumer");
        numbers.forEach(bigNumberConsumer);

        System.out.println("\nВыведем все числа больше 100 через Stream + Consumer");
        numbers
                .stream()
                .forEach(bigNumberConsumer::accept);

        System.out.println("\nВыведем все числа больше 100 через forEach + Consumer без отдельного");
        numbers.forEach(number -> {
            if (number != null && number > 100) {
                System.out.println(number);
            }
        });
    }
}