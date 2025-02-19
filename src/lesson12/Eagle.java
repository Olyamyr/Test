package lesson12;

import lesson12.interfaces.Fly;
import lesson12.interfaces.Hunt;

public class Eagle extends Animal implements Fly, Hunt {
    public Eagle(String food, String name, int age, String color) {
        super(food, name, age, color);
    }

    @Override
    public void fly() {
        System.out.println("Лечу высоко в небе");
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь на мелких животных");
    }

    @Override
    public void move() {
        System.out.println("Быстро летаю");
    }

    @Override
    public void eat() {
        System.out.println("Ем свою добычу");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю в гнезде");
    }
}
