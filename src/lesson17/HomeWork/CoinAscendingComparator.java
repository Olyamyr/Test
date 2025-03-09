package lesson17.HomeWork;

import java.util.Comparator;

public class CoinAscendingComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin c1, Coin c2) {
        //Сначала сортируем по диаметру (от большего к меньшему)
        int diameterComparison = Double.compare(c2.getDiameter(), c1.getDiameter());
        if (diameterComparison != 0) {
            return diameterComparison;
        }

        //Затем сортируем по году (от меньшего к большему)
        int yearComparison = Integer.compare(c1.getYear(), c2.getYear());
        if (yearComparison != 0) {
            return yearComparison;
        }

        //Затем сортируем по металлу (по алфавиту от А до Я)
        int metalComparison = c1.getMetal().compareToIgnoreCase(c2.getMetal());
        if (metalComparison != 0) {
            return metalComparison;
        }

        //Затем сортируем по номиналу (от меньшего к большему)
        return Double.compare(c1.getNominal(), c2.getNominal());
    }
}
