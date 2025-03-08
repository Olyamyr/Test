package lesson18;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создадим мапу для хранения гейтов (выходов на посадку) и соответствующих им рейсов");
        Map<Integer, String> gates = new TreeMap<>();

        System.out.println("\nДобавим туда несколько записей");
        gates.put(1, "Санкт-Петербург - Москва");
        gates.put(4, "Самара - Калининград");
        gates.put(3, "Москва - Сочи");
        gates.put(2, "Москва - Санкт-Петербург");

        System.out.println("\nВыведем в консоль все гейты и значения с использованием Map.Entry()");
        for (Map.Entry<Integer, String> entry : gates.entrySet()) {
            Integer gateNumber = entry.getKey();
            String flightName = entry.getValue();
            System.out.println("Посадка на рейс " + flightName + " осуществляется на выходе " + gateNumber);
        }

        System.out.println("\nЗаменим рейс для выхода номер 3");
        gates.put(3, "Москва - Калининград");

        System.out.println("\nПроверим, какой рейс теперь записан в выходе номер 3");
        System.out.println(gates.get(3));

        System.out.println("\nПроверим, есть ли в этом аэропорте выход 5");
        if (gates.containsKey(5)) {
            System.out.println("Выход номер 5 существует");
        } else {
            System.out.println("Такого выхода нет");
        }

        System.out.println("\nПроверим, есть ли в этом аэропорте рейс Москва - Калининград");
        if (gates.containsValue("Москва - Калининград")) {
            System.out.println("Такой рейс существует");
        } else {
            System.out.println("Такого рейса нет");
        }

        System.out.println("\nВыведем в консоль все гейты и значения с использованием keySet()");
        for (Integer gateNumber : gates.keySet()) {
            System.out.println("Посадка на рейс " + gates.get(gateNumber) + " осуществляется на выходе номер " + gateNumber);
        }

        System.out.println("Размер мапы: " + gates.size());
        //gates.isEmpty() - то, что внутри if(), ? - if, : - else   - это тернарные операторы
        System.out.println("Пустая ли мапа? " + (gates.isEmpty() ? "да" : "нет"));
        //Могли бы записать так
//        if (gates.isEmpty()) {
//            System.out.println("Да");
//        } else {
//            System.out.println("Нет");
//        }

        gates.remove(1);
    }
}
