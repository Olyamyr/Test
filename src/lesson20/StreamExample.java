package lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Дмитрий", 1, 19, "Россия"));
        students.add(new Student("Владислав", 2, 20, "Беларусь"));
        students.add(new Student("Ольга", 1, 20, "Россия"));
        students.add(new Student("Джон", 2, 20, "Америка"));
        students.add(new Student("Иван", 1, 22, "Казахстан"));
        students.add(new Student("Акмал", 1, 18, "Казахстан"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Евгения", 3, 22, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Алена", 2, 20, "Молдова"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));

        //На основе полученных данных из списка list найти сколько уникальных студентов учится в ВУЗЕ.
        long quantityOfStudents = students.stream()
                .distinct()
                .count();
        System.out.println(quantityOfStudents);

        // На основе полученных данных из списка list
        // найти всех студентов, которые учатся в России,
        // отсортировать их по алфавитному порядку имени
        // преобразовать их в короткую версию записи о студенте,
        // ограничиться только первыми 2
        // вывести в консоль

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, которые учатся в России,\n" +
                "отсортировать их по алфавитному порядку имени\n" +
                "преобразовать их в короткую версию записи о студенте,\n" +
                "ограничиться только первыми 2\n" +
                "вывести в консоль");
        students.stream()
                .filter(student -> student.getCountry().equals("Россия"))
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .map(student -> new ShortStudent(student.getName(), student.getAge()))
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, которые учатся не из России и старше 19,\n" +
                "проверить, все ли учатся на первом курсе");
        boolean isAllFirstCourse = students.stream()
                .filter(student -> !student.getCountry().equals("Россия") && student.getAge() > 19)
                .allMatch(student -> student.getCourse() == 1);
        System.out.println(isAllFirstCourse);

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, которые не из Америки,\n" +
                "при этом старше 30\n" +
                "если такие есть, то любого вывести в консоль, если нет, написать, что отсутствуют\n");
        Optional<Student> optStudent = students.stream()
                .filter(student -> !student.getCountry().equals("Америка") && student.getAge() > 30)
                .findAny();

        if (optStudent.isPresent()) {
            Student student = optStudent.get();
            System.out.println(student);
        } else {
            System.out.println("Такие студенты отсутствуют");
        }

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, которые не из Америки,\n" +
                "при этом старше 10\n" +
                "если такие есть, то любого вывести в консоль\n");
        students.stream()
                .filter(student -> !student.getCountry().equals("Америка") && student.getAge() > 10)
                .findAny()
                .ifPresent(student -> System.out.println("\n" + student));

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов и переложить из в список студентов типа ShortStudent\n");
        //Вариант 1
        List<ShortStudent> shortStudents = students.stream()
                .map(student -> new ShortStudent(student.getName(), student.getAge()))
                .toList();

        //Вариант 2
        List<ShortStudent> shortStudents2 = students.stream()
                .map(student -> new ShortStudent(student.getName(), student.getAge()))
                .collect(Collectors.toList());

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, и собрать их имена в строку через запятую\n");
        String row = students.stream()
                .map(student -> student.getName())
                .collect(Collectors.joining(", "));
        System.out.println(row);
    }
}

