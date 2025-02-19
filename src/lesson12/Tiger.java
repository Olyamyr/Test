package lesson12;

import lesson12.interfaces.Hunt;

public class Tiger extends Animal implements Hunt {
    public Tiger(String food, String name, int age, String color) {
        super(food, name, age, color);
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь в джунглях");
    }

    @Override
    public void move() {
        System.out.println("Прыгаю за добычей");
    }

    @Override
    public void eat() {
        System.out.println("Ем мясо и людей");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю и мечтаю о еде");
    }
}
