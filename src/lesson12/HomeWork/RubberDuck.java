package lesson12.HomeWork;

public class RubberDuck extends Ducks {
    public RubberDuck(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю в ванной");
    }
}
