package lesson20.HomeWork;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Пятерочка", 50000, 50));
        shops.add(new Shop("Магнит", 70000, 15));
        shops.add(new Shop("Перекресток", 30000, 80));
        shops.add(new Shop("ВкуссВилл", 40000, 20));
        shops.add(new Shop("Ашан", 60000, 46));

        System.out.println("a) Посчитать общий доход по всем магазинам: ");
        int totalIncome = shops.stream()
                .mapToInt(shop -> shop.getIncome())
                .sum();
        System.out.println(totalIncome);

        System.out.println("\nb) Посчитать количество магазинов: ");
        long count = shops.stream()
                .count();
        System.out.println(count);

        System.out.println("\nc) Посчитать средний доход на каждый магазин: ");
        double averageIncome = shops.stream()
                .mapToInt(shop -> shop.getIncome())
                .average()
                .orElse(0);
        System.out.println(averageIncome);

        System.out.println("\nd) Сортировка магазинов по доходности от большего к меньшему: ");
        shops.stream()
                .sorted((shop1, shop2) -> shop2.getIncome() - shop1.getIncome())
                .forEach(System.out::println);

        System.out.println("\ne) Магазины, в которых соотношение доход на 1 м² больше 1000 рублей:");
        shops.stream()
                .filter(shop -> shop.getIncome() / shop.getArea() > 1000)
                .forEach(System.out::println);

        System.out.println("\nf) Топ 2 лучших и худших магазина по доходу: ");
        shops.stream()
                .sorted((shop1, shop2) -> shop2.getIncome() - shop1.getIncome())
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Топ 2 худших магазина по доходу: ");
        shops.stream()
                .sorted((shop1, shop2) -> shop1.getIncome() - shop2.getIncome())
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ng) Вывести в консоль магазины, в которых соотношение доход на 1м квадратный больше " +
                "1000 рублей ");
        shops.stream()
                .filter(shop -> shop.getIncome() / shop.getArea() > 1000)
                .forEach(System.out::println);
    }
}
