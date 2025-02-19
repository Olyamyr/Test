package lesson11;

public class Main {
    public static void main(String[] args) {
        // 1) Создать переменную ссылочного типа целого числа
        Integer refInt = 42;
        // 2) Записать ее значение в переменную примитивного типа целого числа
        int primitiveInt = refInt;
        // 3) Записать полученное значение в переменную строкового типа и вывести в консоль
        String string = String.valueOf(primitiveInt);
        System.out.println(string);

        // 1) Создать переменную примитивного типа для НЕ целых чисел
        double primitDouble = 5.19;
        // 2) Записать ее значение в переменную ссылочного типа НЕ целого числа
        Double referenceDouble = primitDouble;
        // 3) Создать еще одну переменную ссылочного типа с другим значением
        Double referenceDouble2 = 12.23;
        // 4) Сравнить и вывести в консоль больше ли переменная 1, чем переменная 2.
        if (referenceDouble > referenceDouble2) {
            System.out.println("Переменная 1 больше, чем переменная 2.");
        } else {
            System.out.println("Переменная 1 меньше, чем переменная 2.");
        }

        double primitiveDouble = 2.5;
        Double linkDouble = 2.5;
        Double linkDouble2 = 2.5;

        if (Double.compare(linkDouble2, linkDouble) == 0) {
            System.out.println("Они равны");
        } else {
            System.out.println("Они не равны");
        }

        linkDouble.compareTo(linkDouble2);
        //Double.compare() - статичный метод класса Double, который требует передать в него 2 объекта для сравнения
        //возвращает 1, если первое число больше второго, 0 - если они равны, и -1 если первое число меньше второго

        //compareTo() - вызывается только у переменной типа Double(или Integer и так далее)
        //сравнивает значение ЭТОЙ переменной с той, которую в метод передали
        //возвращает 1, если первое число больше второго, 0 - если они равны, и -1 если первое число меньше второго


        //Создать строковую переменную ссылочного типа с НЕ целым числом (внутри в содержании)
        String nonIntegerString = "23.13";
        //Преобразовать ее в переменную ссылочного типа числового(НЕ целового числа)
        Double nonIntegerDouble = Double.valueOf(nonIntegerString);
        //Привести данное число к примитивной переменной целового числа
        int primitiveInteger = nonIntegerDouble.intValue();
        //Вывести результат в консоль
        System.out.println("Результат приведения к целому числу: " + primitiveInteger);
    }
}