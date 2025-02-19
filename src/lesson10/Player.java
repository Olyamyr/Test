package lesson10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public boolean doYouNeedMoreCards() {
        if (!isCanWin()) {
            System.out.println(name + " достиг(ла) значения " + countNominalInHand() + ", больше нельзя брать карты");
            return false;
        }

        openHand();
        System.out.println(name + ", у вас " + countNominalInHand() + " очка(ов), хотите ли вы взять следующую карту?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    public void openHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public int countNominalInHand() {
        int totalNominal = 0;
        for (Card card : hand) {
            totalNominal += card.getNominal();
        }
        return totalNominal;
    }

    public boolean isCanWin() {
        return countNominalInHand() <= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Игрок по имени" + name;
    }
}