package lesson12.HomeWork;

public class PlushDuck extends Ducks implements Quacking {
    public PlushDuck(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Я впитываю воду");
    }

    @Override
    public void quack() {
        System.out.println("Я издаю звук при сжатии");
    }
}
