package lesson12;

import java.util.Objects;

//Создание полей класса
public abstract class Animal {
    private String food;
    private String name;
    private int age;
    private String color;

    public Animal(String food, String name, int age, String color) {
        this.food = food;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //Реализация методов
    public abstract void move();

    public abstract void eat();

    public abstract void sleep();

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(food, animal.food) && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, name, age, color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
