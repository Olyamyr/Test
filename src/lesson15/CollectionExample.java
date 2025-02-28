package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        CollectionUtilsImpl utils = new CollectionUtilsImpl();

        //Создаем две коллекции
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(9);

        System.out.println("Объединение двух коллекций с дубликатами: " + utils.union(arrayList, linkedList));
        System.out.println("Пересечение двух коллекций с дубликатами: " + utils.intersection(arrayList, linkedList));
        System.out.println("Объединение двух коллекций без дубликатов: " + utils.unionWithoutDuplicate(arrayList, linkedList));
        System.out.println("Пересечение двух коллекций без дубликатов: " + utils.intersectionWithoutDuplicate(arrayList, linkedList));
        System.out.println("Разность двух коллекций: " + utils.difference(arrayList, linkedList));
    }
}
