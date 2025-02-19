package lesson9.task2;

import java.util.Objects;

//Родительский абстрактный класс Animal
public abstract class Animal {
    //Создание полей класса
    protected int age;
    protected double weight;

    //Создание конструктора класса
    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    //Реализация методов
    public abstract void move();

    public void eat() {
        System.out.println("Животное ест");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }

    @Override
    public String toString() {
        return "Животное: " +
                "возраст - " + age + " лет" + '\'' +
                ", вес - " + weight + " кг" + '\'';
    }
}
