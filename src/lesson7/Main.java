package lesson7;

public class Main {
    public static void main(String[] args) {
        //Создание объекта и установка значений в его поля сразу через конструктор
        Car carLada = new Car(1.6, "Лада", "Веста", "Оранжевый");
        Car carLada2 = new Car(1.6, "Лада", "Веста", "Оранжевый");

        //Создание объекта пустым конструктором (без инициализации полей при создании) и установка значений через сеттеры
        Car carMercedes = new Car();
        //применение сеттеров
        carMercedes.setEngineVolume(5.0);
        carMercedes.setBrand("Мерседес");
        carMercedes.setModel("Гелентваген");
        carMercedes.setColor("Черный");

        //Используем свои методы
        carMercedes.startEngine();

        //Применение геттеров
        System.out.println(carMercedes.getBrand() + " " + carMercedes.getModel() + " " + carMercedes.getColor() + " " + carMercedes.getEngineVolume());

        //Проверка метода toString() - преобразование в строку
        System.out.println(carLada.toString());

        //Демонстрация работы equals()
        System.out.println(carLada2.equals(carLada));
    }

}
