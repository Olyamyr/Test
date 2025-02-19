package lesson12.HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Создай приложение, моделирующее поведение трех видов уток: живой, плюшевой и резиновой.
        //Каждому виду утки присущи свои особенности, такие как способность плавать, крякать и летать.
        //Живые утки умеют всё это, плюс они могут размножаться.
        //Плюшевые утки могут только плавать и крякать, а резиновые утки лишь плавают.
        //Используя интерфейсы и абстрактные классы, разработай модель, которая позволит легко добавить новых видов уток в будущем.
        //Напиши тестовый класс Main, который создает экземпляры всех трех видов уток и вызывает их методы.

        LiveDuck liveDuck = new LiveDuck("Лола", "черно-белая");
        PlushDuck plushDuck = new PlushDuck("Полли", "розовая");
        RubberDuck rubberDuck = new RubberDuck("Люся", "желтая");

        ArrayList<Ducks> ducks = new ArrayList<>();
        ducks.add(liveDuck);
        ducks.add(plushDuck);
        ducks.add(rubberDuck);

        for (Ducks duck : ducks) {
            System.out.println("\nМеня зовут " + duck.getName());
            duck.swim();
            if (duck instanceof Quacking) {
                ((Quacking) duck).quack();
            }
            if (duck instanceof Flyable) {
                ((Flyable) duck).fly();
            }
            if (duck instanceof Reproducible) {
                ((Reproducible) duck).reproduce();
            }
        }
    }
}
