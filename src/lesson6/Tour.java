package lesson6;

import java.util.Objects;

/**
 * Класс отвечающий за модель тура
 */

public class Tour {
    private final String country;
    private final String city;
    private String transport;
    private int days;
    private int price;
    private int stars;
    private String food;

    public Tour(String country, String city, String food, int days, int price, int stars, String transport) {
        this.country = country;
        this.city = city;
        this.food = food;
        this.days = days;
        this.price = price;
        this.stars = stars;
        this.transport = transport;
    }

    public String getCountry() { return country; }

    public String getFood() { return food; }

    public void setFood(String food) { this.food = food; }

    public int getStars() { return stars; }

    public void setStars(int stars) { this.stars = stars; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public int getDays() { return days; }

    public void setDays(int days) { this.days = days; }

    public String getTransport() { return transport; }

    public void setTransport(String transport) { this.transport = transport; }

    public String getCity() { return city; }

    @Override
    public String toString() {
        return "Тур: " +
                "Страна ='" + country + '\'' +
                ", Город - '" + city + '\'' +
                ", Транспорт ='" + transport + '\'' +
                ", Дни = " + days +
                ", Цена = " + price +
                ", Звезды = " + stars +
                ", Питание = '" + food + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return days == tour.days && price == tour.price && stars == tour.stars && Objects.equals(country, tour.country) && Objects.equals(city, tour.city) && Objects.equals(transport, tour.transport) && Objects.equals(food, tour.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, transport, days, price, stars, food);
    }
}