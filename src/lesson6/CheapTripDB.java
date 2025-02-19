package lesson6;

/**
 * База данных тура
 */
public class CheapTripDB {
    private Tour[] tours = new Tour[100];

    public CheapTripDB() {
        addTour("Турция", "Стамбул", "Самолет", 5, 100_000, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 7, 150_000, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 10, 150_000, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 5, 70000, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 9, 135_000, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 4, 78000, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 5, 80000, 4, "завтрак");
        addTour("Шри-ланка", "Коломбо", "Самолет", 10, 200_000, 5, "все включено");
    }

    public void addTour(String country, String city, String transport, int days, int price, int stars, String food) {
        Tour tour = new Tour(country, city, transport, days, price, stars, food);

        for (int index = 0; index < tours.length; index++) {
            if (tours[index] == null) {
                tours[index] = tour;
                return;
            }
        }
    }

    public void getAllTours() {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            Tour tour = tours[tourIndex];

            if (tour == null) {
                return;
            }

            System.out.println(tour);
        }
    }

    public void getToursByPrice(int price) {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            Tour tour = tours[tourIndex];

            if (tour == null) {
                return;
            }

            if (tour.getPrice() <= price) {
                System.out.println(tour);
            }
        }
    }

    public void getToursByCountry(String country) {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            if (tours[tourIndex] != null) {
                Tour tour = tours[tourIndex];
                if (tour.getCountry().equalsIgnoreCase(country)) {
                    System.out.println(tour);
                }
            }
        }
    }

    public void getToursByCity(String city) {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            if (tours[tourIndex] != null) {
                Tour tour = tours[tourIndex];
                if (tour.getCity().equalsIgnoreCase(city)) {
                    System.out.println(tour);
                }
            }
        }
    }

    public void getToursByStars(int stars) {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            if (tours[tourIndex] != null) {
                Tour tour = tours[tourIndex];
                if (tour.getStars() == stars) {
                    System.out.println(tour);
                }
            }
        }
    }

    public void getToursByPriceAndStars(int price, int stars) {
        for (int tourIndex = 0; tourIndex < tours.length; tourIndex++) {
            if (tours[tourIndex] != null) {
                Tour tour = tours[tourIndex];
                if (tour.getPrice() <= price && tour.getStars() >= stars) {
                    System.out.println(tour);
                }
            }
        }
    }
}