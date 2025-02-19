package lesson9.task2;

import java.util.Objects;

//Класс-наследник от Animal
public class Snake extends Animal {
    //Создание поля класса
    private final int quantityOfVertebrae;

    //Создание конструктора класса
    public Snake(int age, double weight, int quantityOfVertebrae) {
        super(age, weight);
        this.quantityOfVertebrae = quantityOfVertebrae;
    }

    //Реализация методов
    @Override
    public void move() {
        System.out.println("Змея ползёт");
    }

    public void hiss() {
        System.out.println("Змея шипит");
    }

    public int getQuantityOfVertebrae() {
        return quantityOfVertebrae;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Snake snake = (Snake) o;
        return quantityOfVertebrae == snake.quantityOfVertebrae;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityOfVertebrae);
    }

    @Override
    public String toString() {
        return "Змея: " +
                "количество позвонков - " + quantityOfVertebrae + '\'';
    }
}