package lesson12;

import lesson12.interfaces.Fly;
import lesson12.interfaces.Swim;

public class Swan extends Animal implements Fly, Swim {
    public Swan(String food, String name, int age, String color) {
        super(food, name, age, color);
    }

    @Override
    public void fly() {
        System.out.println("Грациозно летаю");
    }

    @Override
    public void swim() {
        System.out.println("Плавно плыву по воде");
    }

    @Override
    public void move() {
        System.out.println("Плыву по воде");
    }

    @Override
    public void eat() {
        System.out.println("Ем водные растения");
    }

    @Override
    public void sleep() {
        System.out.println("Мирно сплю, спрятав голову под крыло");
    }
}