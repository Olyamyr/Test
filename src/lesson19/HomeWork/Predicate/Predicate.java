package lesson19.HomeWork.Predicate;

import java.util.List;

public class Predicate {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 415, 38, 85, 1905, 1005, 1065, 5, 3, 150, 1, 999);

        System.out.println("\nНайдем все числа большие 100, содержащие цифры 1, 5");
        for (Integer number : numbers) {
            if (number > 100 && number.toString().contains("1") && number.toString().contains("5")) {
                System.out.println(number);
            }
        }

        System.out.println("\nНайдем все числа большие 100, содержащие цифры 1, 5 с помощью предиката");
        NumberValidationPredicate predicate = new NumberValidationPredicate();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                System.out.println(number);
            }
        }

        System.out.println("\nНайдем все числа большие 100, содержащие цифры 1, 5 через стрим");
        numbers
                .stream()
                .filter(predicate::test)
                .forEach(System.out::println);

        System.out.println("\nНайдем все цифры с числом 6:");
        numbers
                .stream()
                .filter(number -> number.toString().contains("6"))
                .forEach(System.out::println);
    }
}

