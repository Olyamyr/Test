package lesson12;

import lesson12.interfaces.Fly;
import lesson12.interfaces.Hunt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // --- Создадим животных ---
        //Орел
        //Слон
        //Жираф
        //Тигр
        //Лебедь
        // --- Есть ли у животных какие-то общие поля состояния? ---
        //Еда
        //Имя
        //Возраст
        //Цвет
        // --- Есть ли общее поведение? ---
        //Двигаются
        //Едят
        //Спят
        // --- Есть ли индивидуальное поведение? ---
        //Лебедь и орел летают
        //Тигр и орел охотятся
        //Лебедь плавает

        Eagle eagle = new Eagle("Падаль", "коричневый", 10, "Янки" );
        Tiger tiger = new Tiger("Мясо", "Полосатый", 15, "Шархан");
        Swan swan = new Swan("Рыбу", "Белый", 18, "Олег");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(eagle);
        animals.add(tiger);
        animals.add(swan);

        for (Animal animal : animals) {
            System.out.println("\n" + animal.getName());
            animal.eat();
            animal.move();
            animal.sleep();

            if (animal instanceof Fly) {
                Fly fly = (Fly) animal;
                fly.fly();
            }

            if (animal instanceof Hunt) {
                Hunt hunt = (Hunt) animal;
                hunt.hunt();
            }
        }
    }
}
