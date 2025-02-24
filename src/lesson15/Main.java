package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список:");
        List<Integer> nunbers = new ArrayList<>();

        System.out.println("\n add (E element): Добавляет элемент в конец списка.");
        nunbers.add(1);
        nunbers.add(2);
        nunbers.add(3);
        nunbers.add(4);
        nunbers.add(99);

        System.out.println("\n add (int index, E element): Добавляет элмент в список на определенной позиции.");
        nunbers.add(2, 15);

        System.out.println("\n add (int index): Удаляет элемент на определенной позиции.");
        nunbers.remove(3);

        System.out.println("\n add (int index, E element): Заменяет элемент на указанной позиции новым значением.");
        nunbers.set(0, 99);

        System.out.println("\n add (int index, E element): Заменяет элемент на указанной позиции новым значением.");
        System.out.println("Получаю элемент с индексом 0: " + nunbers.get(0));


        System.out.println("Получаю индекс первой ячейки или единственной, в которой лежит число 99: "
                + nunbers.indexOf(99));


        System.out.println("Получаю индекс последней ячейки или единственной, в которой лежит число 99: "
                + nunbers.lastIndexOf(99));

        System.out.println("Есть ли элемент 99 - " + nunbers.contains(99));
        System.out.println("Есть ли элемент 0 - " + nunbers.contains(0));

        System.out.println("Выводим все элемент списка до сортировки");
        System.out.println(nunbers);

//        System.out.println("Выводим все элемент списка до сортировки");
//        nunbersList.sort();
//
//        System.out.println("Выводим все элемент списка после сортировки");
//        System.out.println(nunbersList);

        System.out.println("Вывод всех элементов до очистки");
        nunbers.clear();

        System.out.println("Вывод всех элементов после очистки");
        nunbers.clear();
    }
}
