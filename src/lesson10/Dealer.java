package lesson10;

public class Dealer extends Player {

    public Dealer() {
        super("Дилер");
    }

    @Override
    public boolean doYouNeedMoreCards() {
        return countNominalInHand() < 17;
    }
}