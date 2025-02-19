package lesson8;

public class QuestionsForTest {
    public static final boolean PRINT_ANSWER = true;

    //max сумма баллов = 19
    public static void main(String[] args) {
        System.out.println("Тест по итогам первых 7 занятий.");
        printQuestion1();
        printQuestion2();
        printQuestion3();
        printQuestion4();
        printQuestion5();
        printQuestion6();
        printQuestion7();
        printQuestion8();
        printQuestion9();
        printQuestion10();
    }

    public static void printQuestion1() {
        System.out.println("\nВопрос 1.");
        System.out.println("Что будет результатом действия данного метода?");
        System.out.println("        String string = \"This is a String\";\n" +
                "        char[] chars = string.toCharArray();\n" +
                "        int arraySize = chars.length;");

        String string = "This is a String";
        char[] chars = string.toCharArray();
        int arraySize = chars.length;
        if (PRINT_ANSWER) {
            System.out.println("Ответ: " + arraySize);
        } else {
            System.out.println();
        }
    }

    public static void printQuestion2() {
        System.out.println("\nВопрос 2.");
        System.out.println("Какое из выражений является, корректным и увеличивающим на 1?");
        System.out.println("1) i++");
        System.out.println("2) i = i + 1");
        System.out.println("3) i+=1");
        System.out.println("4) i + 1");

        if (PRINT_ANSWER) {
            System.out.println("Ответ: 123");
        } else {
            System.out.println();
        }
    }

    public static void printQuestion3() {
        System.out.println("\nВопрос 3.");
        System.out.println("Какое из выражений верно для Java?");
        System.out.println("1) Один и тот же массив может содержать объекты и переменные разных типов данных");
        System.out.println("2) Индекс массива может быть любым числовым типом (byte, short, long, int и так далее)");
        System.out.println("3) Нумерация индексов в массиве начинается с 1");
        System.out.println("4) Размер массива может меняться при добавлении новых элементов");
        System.out.println("5) Ни один из ответов не верный");

        if (PRINT_ANSWER) {
            System.out.println("Ответ: 5");
        } else {
            System.out.println();
        }
    }

    public static void printQuestion4() {
        System.out.println("\nВопрос 4.");
        System.out.println("Что будет результатом выполнения каждой операции?");
        System.out.println(" 21/3.0 ");
        System.out.println(" 16/3");
        System.out.println(" 3 + 4 * 4 > 5 * (4 + 3) - 1");



        if (PRINT_ANSWER) {
            System.out.println("Ответы");
            System.out.println(" 21/3.0 = " + 21/3.0);
            System.out.println(" 16/3 = " + 16/3);
            System.out.println(" 3 + 4 * 4 > 5 * (4 + 3) - 1 = " + (3 + 4 * 4 > 5 * (4 + 3) - 1));
        } else {
            System.out.println();
        }
    }

    public static void printQuestion5() {
        System.out.println("\nВопрос 5.");
        System.out.println("Какие выражение корректны для Java?");
        System.out.println("1) --i");
        System.out.println("2) i+");
        System.out.println("3) i+=1");
        System.out.println("4) i--1");


        if (PRINT_ANSWER) {
            System.out.println("Ответ: 13");
        } else {
            System.out.println();
        }
    }

    public static void printQuestion6() {
        System.out.println("\nВопрос 6.");
        System.out.println("Какие выражение завершаться с ошибкой/исключением?");
        System.out.println("1) double d = 1.0");
        System.out.println("2) int i = 1.0");
        System.out.println("3) boolean b = 'true'");

        if (PRINT_ANSWER) {
            System.out.println("Ответ: 23");
        } else {
            System.out.println();
        }
    }

    public static void printQuestion7() {
        System.out.println("\nВопрос 7.");
        System.out.println("Что напечатается на консоль в результате выполнения кода?");
        System.out.println("            double[] values = new double[5];\n" +
                "            System.out.println(values[4]);");

        if (PRINT_ANSWER) {
            double[] values = new double[5];
            System.out.println("Ответ: " + values[4]);
        } else {
            System.out.println();
        }
    }

    public static void printQuestion8() {
        System.out.println("\nВопрос 8.");
        System.out.println("Какое из наименований переменных не приведут к проблеме запуска программы в Java?");
        System.out.println("1) p");
        System.out.println("2) 7up");
        System.out.println("3) for");
        System.out.println("4) float");
        System.out.println("5) Test");

        if (PRINT_ANSWER) {
            System.out.println("Ответ: 15");
        } else {
            System.out.println();
        }
    }

    public static void printQuestion9() {
        System.out.println("\nВопрос 9.");
        System.out.println("Какой результат будет в консоли?");
        System.out.println("            boolean i = true;\n" +
                "            boolean j = !i;\n" +
                "            i = !j;\n" +
                "            boolean k = !i || !j;\n" +
                "            boolean o = i && k;\n" +
                "            if (o) {\n" +
                "                i = !j;\n" +
                "            }\n" +
                "            System.out.println(\"i + \"\" + j + \"\" + k);");

        if (PRINT_ANSWER) {
            boolean i = true;
            boolean j = !i;
            i = !j;
            boolean k = !i || !j;
            boolean o = i && k;
            if (o) {
                i = !j;
            }
            System.out.println("Ответ: " + (i + "" + j + "" + k));
        } else {
            System.out.println();
        }
    }

    public static void printQuestion10() {
        System.out.println("\nВопрос 10.");
        System.out.println("Какое утверждение ложно?");
        System.out.println("1) Наименования переменных могут иметь любую длину.");
        System.out.println("2) Имя класса не может содержат пробелов");
        System.out.println("3) Метод в java обязательно должен возвращать какое-то значение");

        if (PRINT_ANSWER) {
            System.out.println("Ответ: 3");
        } else {
            System.out.println();
        }
    }
}