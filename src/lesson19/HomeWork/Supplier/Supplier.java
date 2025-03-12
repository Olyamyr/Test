package lesson19.HomeWork.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Supplier {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ольга", "Михаил", "Сергей", "Марина", "Татьяна", "Александр");

        System.out.println("Выведем имена из списка");
        names.forEach(System.out::println);

        System.out.println("\nВыведем имена из списка с помощью stream и forEach");
        names.stream().forEach(System.out::println);

        System.out.println("\nИспользование Supplier в виде отдельного класса:");
        RandomNameSupplier randomNameSupplier = new RandomNameSupplier(names);
        System.out.println(randomNameSupplier.get());
    }
}