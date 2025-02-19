package lesson12;

public class Giraffe extends Animal{
    public Giraffe(String food, String name, int age, String color) {
        super(food, name, age, color);
    }

    @Override
    public void move() {
        System.out.println("");
    }

    @Override
    public void eat() {
        System.out.println("");
    }

    @Override
    public void sleep() {
        System.out.println("");
    }
}