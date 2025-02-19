package lesson7;

import java.util.Objects;

public class Animal {
    private final String name;
    private double height;
    private double weight;
    private String color;
    private int numberOfPaws;
    private String favoriteFood;

    public Animal(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = "";
        this.numberOfPaws = 0;
        this.favoriteFood = "";
    }

    public void sayName() {
        System.out.println("Меня зовут " + name);
    }

    public void sayHeight() {
        System.out.printf("Мой рост " + height + " см\n");
    }

    public void sayWeight() {
        System.out.printf("Мой вес " + weight + " кг\n");
    }

    public void sayColor() {
        System.out.println("Я " + color);
    }

    public void sayNumberOfLegs() {
        System.out.println("У меня " + numberOfPaws + " лапы");
    }

    public void sayFavoriteFood() {
        if (!favoriteFood.isEmpty()) {
            System.out.println("Моя любимая еда — " + favoriteFood);
        }
    }

    public String getName() { return name; }

    public double getHeight() { return height; }

    public void setHeight(double newHeight) {
        if (newHeight > 0) {
            this.height = newHeight;
        }
    }

    public double getWeight() { return weight; }

    public void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        }
    }

    public String getColor() { return color; }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public double getNumberOfPaws() { return numberOfPaws; }

    public void setNumberOfPaws(int newNumberOfPaws) {
        if (newNumberOfPaws > 0) {
            this.numberOfPaws = newNumberOfPaws;
        }
    }

    public String getFavoriteFood() { return favoriteFood; }

    public void setFavoriteFood(String newFavoriteFood) {
        this.favoriteFood = newFavoriteFood;
    }

    @Override
    public String toString() {
        return "Животное: " +
                "Меня зовут - '" + name + '\'' +
                ", мой рост - '" + height + " см" + '\'' +
                ", мой вес - '" + weight + " кг" + '\'' +
                ", я - '" + color + '\'' +
                ", у меня '" + numberOfPaws + '\'' + " лапы" +
                ", моя любимая еда - '" + favoriteFood + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(height, animal.height) == 0 && Double.compare(weight, animal.weight) == 0 &&
                Double.compare(numberOfPaws, animal.numberOfPaws) == 0 && Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color) && Objects.equals(favoriteFood, animal.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name, color, numberOfPaws, favoriteFood);
    }
}