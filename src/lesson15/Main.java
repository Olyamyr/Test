package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список:");
        List<Integer> numbers = new ArrayList<>();

        System.out.println("\n add(int index): Добавляет элемент в конец списка.");
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(99);

        System.out.println("\n add (int index, E element): Добавляет элемент в список на определенной позиции.");
        numbers.add(2, 15);

        System.out.println("\n remove(int index): Удаляет элемент на определенной позиции.");
        numbers.remove(3);

        System.out.println("\n set(int index, E element): Заменяет элемент на указанной позиции новым значением.");
        numbers.set(0, 99);

        System.out.println("\n get(int index): Возвращает элемент на данной позиции.");
        System.out.println("Получаю элемент с индексом 0: " + numbers.get(0));

        System.out.println("\n indexOf(Object o): Находит индекс первого вхождения данного объекта в списке.");
        System.out.println("Получаю индекс первой ячейки или единственной, в которой лежит число 99: "
                + numbers.indexOf(99));

        System.out.println("\n lastIndexOf(Object o): Находит последний индекс вхождения данного объекта в списке.");
        System.out.println("Получаю индекс последней ячейки или единственной, в которой лежит число 99: "
                + numbers.lastIndexOf(99));
        System.out.println("\n contains(Object o): Проверяет, содержится ли данный объект в списке.");
        System.out.println("Проверка, есть ли элемент 99 - " + numbers.contains(99));
        System.out.println("Проверка, есть ли элемент 0 - " + numbers.contains(0));


//        System.out.println("\n Выводим все элементы списка до сортировки");
//        System.out.println(numbers);

//        System.out.println("\n sort(): Сортирует элементы в списке.");
//        nunbers.sort();
//
//        System.out.println("\n Выводим все элемент списка после сортировки");
//        System.out.println(nunbers);

        System.out.println("Вывод всех элементов до очистки");
        System.out.println(numbers);

        System.out.println("\n clear(): Очищает список, удаляя все его элементы.");
        numbers.clear();

        System.out.println("Вывод всех элементов после очистки");
        System.out.println(numbers);
    }
}
