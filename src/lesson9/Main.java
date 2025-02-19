package lesson9;

public class Main {
    public static void main(String[] args) {
        ChildCar childCar = new ChildCar(4, "Красный", "Пластик", true);
        ChildCar childCar2 = new ChildCar(4, "Желтая", "Пластик", false);
        SportCar sportCar = new SportCar(4, "Синий", "Карбон", 500,
                "Коробка автомат");
        SnowRemovalCar snowRemovalCar = new SnowRemovalCar(4, "Синий", "Карбон",
                true);

        System.out.println("Демонстрация методов childCar");
        childCar.toPlayChildMusic();

        System.out.println("\nСоздали разные машины и сложили в массив машин");
        Car[] cars = {childCar, childCar2, sportCar, snowRemovalCar};
        for (Car car : cars) {
            System.out.println();

            car.toMove();
            car.toStayOnParking();

            if (car instanceof ChildCar) {                      //instanceof - является ли
                System.out.println("Это детская машина");
                ChildCar childCarFromArray = (ChildCar) car;
                childCarFromArray.toPlayChildMusic();
            } else if (car instanceof SportCar) {
                System.out.println("Это спортивная машина");
                SportCar sportCarFromArray = (SportCar) car;
                sportCarFromArray.toLaunchControl();
                sportCarFromArray.toSpoilerUp();
            } else if (car instanceof SnowRemovalCar) {
                System.out.println("Это снегоуборочная машина");
                SnowRemovalCar snowRemovalCarFromArray = (SnowRemovalCar) car;
                snowRemovalCarFromArray.toRemoveSnow();
            }
        }
    }
}
