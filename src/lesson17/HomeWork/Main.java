package lesson17.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin(5, 1999, 2.5, "Gold"));
        coins.add(new Coin(5, 1999, 2.5, "Gold"));
        coins.add(new Coin(10, 1990, 2.5, "Gold"));
        coins.add(new Coin(50, 1899, 5, "Olovo"));
        coins.add(new Coin(5, 1869, 10, "Silver"));
        coins.add(new Coin(5, 1869, 10, "Zmetall"));

        //Задание 1
        Set<Coin> sortedCoinsTask1 = new TreeSet<>(new CoinAscendingComparator());
        sortedCoinsTask1.addAll(coins);

        System.out.println("Задание 1. Отсортировать монеты по диаметру(от большего к меньшему, году(от меньшего " +
                "к большему), металлу(по алфавиту от А до Я, от A до Z), по номиналу(от меньшего к большему) " +
                "в виде отдельного класса компаратора.");
        sortedCoinsTask1.forEach(System.out::println);

        //Задание 2
        Set<Coin> sortedCoinsTask2 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin c1, Coin c2) {
                //Сначала сортируем по металлу (по алфавиту от Я до А)
                int metalComparison = c2.getMetal().compareToIgnoreCase(c1.getMetal());
                if (metalComparison != 0) {
                    return metalComparison;
                }

                //Затем сортируем по номиналу (от большего к меньшему)
                int nominalComparison = Double.compare(c2.getNominal(), c1.getNominal());
                if (nominalComparison != 0) {
                    return nominalComparison;
                }

                //Затем сортируем по диаметру (от меньшего к большему)
                return Double.compare(c1.getDiameter(), c2.getDiameter());
            }
        });

        sortedCoinsTask2.addAll(coins);

        System.out.println("\nЗадание 2. Отсортировать монеты по металлу(по алфавиту от Я до А, от Z до A), " +
                "по номиналу (от большего к меньшему), по диаметру(от меньшего к большему) " +
                "в виде анонимного класса-сравнителя.");
        sortedCoinsTask2.forEach(System.out::println);
    }
}