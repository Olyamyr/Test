package lesson19.Predicate;

import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "Семечека");

        System.out.println("\nНайдем все слова с буквой Т большой или маленькой, с буквой е большой или маленькой " +
                "и без буквы к большой или маленькой обычным способом");
        for (String word : words) {
            if ((word.contains("т") || word.contains("Т")) && (word.contains("е") || word.contains("Е"))
                    && (!word.contains("к") && !word.contains("К"))) {
                System.out.println(word);
            }
        }

        System.out.println("\nОпределим то же самое с помощью предиката");
        WordValidationPredicate predicate = new WordValidationPredicate();
        for (String word : words) {
            if (predicate.test(word)) {
                System.out.println(word);
            }
        }

        System.out.println("\nНайдем то же самое через стрим");
        words
                .stream()
                .filter(word -> predicate.test(word))
                .forEach(System.out::println);

        //Для такого решения можно использовать предикат без отдельного класса
        System.out.println("\nНайдем все слова с буквой Т");
        words
                .stream()
                .filter(word -> word.contains("Т")) //это тоже предикат, просто однострочный
                .forEach(System.out::println);
    }
}
