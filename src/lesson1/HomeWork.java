package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам нужно купить по максимуму сникерсов, и на сдачу" +
                "купить конфет. Сникерс стоит 35 руб. Конфета - 3,5 руб." +
                "Вывести на консоль сколько мы купим сникерсов? Сколько конфет? И сколько останется сдачи?");

        //Дано
        int sum = 1000;
        int sumSnikers = 35;
        double sumCandy = 3.5;

        //Решение
        int quantityOfSnickers = sum / sumSnikers;
        int change = sum - quantityOfSnickers * sumSnikers;
        int quantityOfCandies = (int) (change / sumCandy);
        int remainingChange = (int) (sum - quantityOfSnickers * sumSnikers - quantityOfCandies * sumCandy);

        System.out.println("Количество сникерсов: " + quantityOfSnickers);
        System.out.println("Количество конфет: " + quantityOfCandies);
        System.out.println("Сдача: " + remainingChange);
    }
}
