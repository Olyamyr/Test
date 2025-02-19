package lesson7;

public class HomeWorkMain {
    public static void main(String[] args) {
        //Создание животных
        Animal dog1 = new Animal("Тимоша", 12.0, 5.0);
        Animal dog2 = new Animal("Тимоша", 12.0, 5.0);
        Animal dog3 = new Animal("Кекс", 20.0, 8.0);

        //Использование метода set для установления цвета, количества лап и любимой еды для каждого животного
        dog1.setColor("черный");
        dog1.setNumberOfPaws(3);
        dog1.setFavoriteFood("Манго");

        dog2.setColor("коричневый");
        dog2.setNumberOfPaws(4);
        dog2.setFavoriteFood("Манго");

        dog3.setColor("белый");
        dog3.setNumberOfPaws(4);
        dog3.setFavoriteFood("Индейка");

        System.out.println("Использование метода say для сообщения о параметрах животных");
        dog1.sayName();
        dog1.sayHeight();
        dog1.sayWeight();
        dog1.sayColor();
        dog1.sayNumberOfLegs();
        dog1.sayFavoriteFood();

        System.out.println();

        dog2.sayName();
        dog2.sayHeight();
        dog2.sayWeight();
        dog2.sayColor();
        dog2.sayNumberOfLegs();
        dog2.sayFavoriteFood();

        System.out.println();

        dog3.sayName();
        dog3.sayHeight();
        dog3.sayWeight();
        dog3.sayColor();
        dog3.sayNumberOfLegs();
        dog3.sayFavoriteFood();

        //Замена параметров у dog1
        dog1.setColor("коричневый");
        dog1.setNumberOfPaws(4);

        System.out.println("\nИспользование метода say для сообщения о новых параметрах dog1");
        dog1.sayColor();
        dog1.sayNumberOfLegs();

        System.out.println("\nПрименение геттеров");
        System.out.println(dog1.getName() + " " + dog1.getHeight() + " " + dog1.getWeight() + " " + dog1.getColor()
                + " " + dog1.getNumberOfPaws() + " " + dog1.getFavoriteFood());
        System.out.println(dog2.getName() + " " + dog2.getHeight() + " " + dog2.getWeight() + " " + dog2.getColor()
                + " " + dog2.getNumberOfPaws() + " " + dog2.getFavoriteFood());
        System.out.println(dog3.getName() + " " + dog3.getHeight() + " " + dog3.getWeight() + " " + dog3.getColor()
                + " " + dog3.getNumberOfPaws() + " " + dog3.getFavoriteFood());

        System.out.println("\nВывод значений с помощью метода toString");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("\nПроверка равенства между животными с помощью метода equals");
        System.out.println(dog1.equals(dog2));
        System.out.println(dog2.equals(dog3));
        System.out.println(dog2.equals(dog3));
    }
}
