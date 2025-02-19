package lesson7;

import java.util.Objects;

public class Car {
    private double engineVolume;
    private String color;
    private String brand;
    private String model;
    //final - добавляем после private, если хотим сделать поле неизменным

    //Пустой конструктор, чтобы создать объект, а значения в поля присвоить потом
    public Car() {

    }

    //Конструктор сразу с параметрами
    public Car(double engineVolume, String brand, String model, String color) {
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("Ррррррррррррр");
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    //все что с @ и желтого цвета - это аннотация - пометка для компилятора.
    // Информационная (то есть как сейчас, сигнализирует,
    // что мы поменяли базовое поведение объекта в этом методе - переопределили
    // или
    // Пометка для компилятора о том, что нужно сгенерировать какой-то блок логики
    @Override
    public String toString() {
        return "Автомобиль: " +
                "объем двигателя - " + engineVolume +
                ", цвет - '" + color + '\'' +
                ", марка - '" + brand + '\'' +
                ", модель - '" + model + '\'';
    }
    //this - ссылается на текущий класс
    //super - ссылается на родительский класс

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(engineVolume, car.engineVolume) == 0 && Objects.equals(color, car.color) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, color, brand, model);
    }
}

