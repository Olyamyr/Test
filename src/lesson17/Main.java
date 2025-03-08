package lesson17;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, 2.5, "Gold");
        Coin coin2 = new Coin(5, 1999, 2.5, "Gold");
        Coin coin3 = new Coin(10, 1990, 2.5, "Gold");
        Coin coin4 = new Coin(50, 1899, 5, "Olovo");
        Coin coin5 = new Coin(5, 1869, 10, "Silver");
        Coin coin6 = new Coin(5, 1869, 10, "Zmetall");

        //Вариант 1 - используем сортировку по умолчанию (метод compareTo для Comparable объектов)
//        Set<Coin> coins = new TreeSet<>();
        //Вариант 2 - используем внешний компаратор (сравниватель) реализованный в виде отдельного класса
//        Set<Coin> coins = new TreeSet<>(new SortByYearComparator());
        //Вариант 3 - используем внешний компаратор (сравниватель) реализованный в виде анонимного класса
        Set<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //Сначала сортируем по металлу
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o1.getMetalName().compareTo(o2.getMetalName());
                }

                //Потом сортируем по году
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }

                //Потом сортируем по номиналу
                if (o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();
                }

                //потом сортируем по диаметру
                return Double.compare(o1.getDiameter(), o2.getDiameter());
            }
        });

//        Set<Coin> coins = new TreeSet<>((o1, o2) -> {
//            //Сначала сортируем по металлу
//            if (!o1.getMetalName().equals(o2.getMetalName())) {
//                return o1.getMetalName().compareTo(o2.getMetalName());
//            }
//
//            //Потом сортируем по году
//            if (o1.getYear() != o2.getYear()) {
//                return o1.getYear() - o2.getYear();
//            }
//
//            //Потом сортируем по номиналу
//            if (o1.getNominal() != o2.getNominal()) {
//                return o1.getNominal() - o2.getNominal();
//            }
//
//            //потом сортируем по диаметру
//            return Double.compare(o1.getDiameter(), o2.getDiameter());
//        });

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
    }
}