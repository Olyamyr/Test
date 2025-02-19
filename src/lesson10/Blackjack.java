package lesson10;

import java.util.Scanner;

public class Blackjack {
    private Player[] players;
    private Deck deck = new Deck();
    private Dealer dealer = new Dealer();

    public void start(int playersQuantity) {
        if (playersQuantity > 5) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество игроков менее 6 человек.");
            return;
        }

        //1 - создали игроков
        createPlayers(playersQuantity);
        //2 - раздали всем по две карты
        dealTwoCardsToPlayers();
        //3 - раздали остальные карты, пока игроки берут
        dealRestCardsToPlayers();
        //4 - напечатали у кого сколько очков
        printPlayersTotalNominal();
        //5 - определили и напечатали победителя
        printWinner();

        // Предложение повторить игру
        System.out.println("\nХотите сыграть ещё раз? (Да/Нет)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да") || answer.equalsIgnoreCase("Yes")) {
            deck.reset(); //Сбросить колоду перед новой игрой
            start(playersQuantity); //Повторный запуск игры
        } else {
            System.out.println("Спасибо за игру! До свидания!");
        }
    }

    /**
     * Создание игроков
     *
     * @param playersQuantity кол-во игроков
     */
    private void createPlayers(int playersQuantity) {
        players = new Player[playersQuantity + 1]; //Добавление Дилера как игрока
        players[0] = dealer;

        for (int playerIndex = 1; playerIndex < players.length; playerIndex++) {
            System.out.println("Введите имя игрока " + (playerIndex) + ":");

            Scanner scanner = new Scanner(System.in);
            String playerName = scanner.next();

            Player player = new Player(playerName);
            players[playerIndex] = player;
        }
    }

    /**
     * Раздать по 2 карты каждому игроку
     */
    private void dealTwoCardsToPlayers() {
        for (Player player : players) {
            Card card1 = deck.getRandomCard();
            Card card2 = deck.getRandomCard();
            player.addCardToHand(card1);
            player.addCardToHand(card2);
        }
    }

    /**
     * Раздать остальные карты каждому игроку (до тех пор, пока хочет брать)
     */
    private void dealRestCardsToPlayers() {
        for (Player player : players) {
            while (player.doYouNeedMoreCards()) {
                Card card = deck.getRandomCard();
                player.addCardToHand(card);
            }
        }
    }

    /**
     * Вывод результатов по очкам
     */

    private void printPlayersTotalNominal() {
        for (Player player : players) {
            System.out.println(player.getName() + " - " + player.countNominalInHand() + " очка(ов)");
        }
    }

    /**
     * Печать победителя
     */

    private void printWinner() {
        //Сначала определяем какой максимум очков
        int maxTotalNominal = 0;
        for (Player player : players) {
            int playerTotalNominal = player.countNominalInHand();
            if (player.countNominalInHand() > maxTotalNominal && player.isCanWin()) {
                maxTotalNominal = playerTotalNominal;
            }
        }

        //Проверяем, что дилер набрал больше всех очков (или не набрал)
        if (dealer.countNominalInHand() == maxTotalNominal) {
            System.out.println("Дилер выиграл");
            return;
        }

        boolean noPlayersScored = true;
        for (Player player : players) {
            if (player.countNominalInHand() > 0) {
                noPlayersScored = false;
                break;
            }
        }
        if (noPlayersScored) {
            System.out.println("Никто не выиграл, все проиграли.");
            return;
        }

        for (Player player : players) {
            int playerTotalNominal = player.countNominalInHand();
            if (playerTotalNominal == maxTotalNominal) {
                System.out.println(player.getName() + " победил, набрав " + playerTotalNominal + " очков");
            }
        }
    }
}