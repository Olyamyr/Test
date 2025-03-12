package lesson19.HomeWork.Consumer;

import java.util.function.Consumer;

public class BigNumberConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer number) {
        if (number != null && number > 100) {
            System.out.println(number);
        }
    }
}