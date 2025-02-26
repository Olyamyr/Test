package lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список:");
        Set<Integer> numbers = new HashSet<>();

        System.out.println("\n add(int index, E element): Добавляет элемент в множество, если он отсутствует.");
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(99);
        numbers.add(2);

        System.out.println("\n size(): Возвращает количество элементов в множестве.");
        System.out.println("Размер коллекции - " + numbers.size());

        System.out.println("\nisEmpty(): Проверяет, пусто ли множество.");
        System.out.println("Множество пустое - " + numbers.isEmpty());

        System.out.println("\n remove(Object o): Удаляет элемент из множества, если элемент присутствует.");
        numbers.remove(3);

        System.out.println("\n contains(Object o): Проверяет, содержится ли элемент в множестве.");
        System.out.println("Проверка, есть ли элемент 99 - " + numbers.contains(99));
        System.out.println("Проверка, есть ли элемент 0 - " + numbers.contains(0));

        System.out.println("\nВывод всех элементов до очистки");
        System.out.println(numbers);

//        numbers.removeIf(number -> number == 2); // Удаляем все элементы, равные (2)

//        Iterator<Integer> iterator = numbers.iterator(); // Получаем итератор>
//        while (iterator.hasNext()) {
//            int number = iterator.next();
//            if (number == 2) {
//                iterator.remove();
//            }
//        }

        System.out.println("\nclear(): Очищает список, удаляя все его элементы.");
        numbers.clear();

        System.out.println("\nВывод всех элементов после очистки");
        System.out.println(numbers);
    }
}
