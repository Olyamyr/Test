package lesson19.HomeWork.Predicate;

import java.util.function.Predicate;

public class NumberValidationPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        //Проверили, что число больше 100 (если нет, оно не соответствует - false)
        if (number < 100) {
            return false;
        }

        // Проверили наличие цифр 1 и 5
        String numStr = number.toString();
        return numStr.contains("1") && numStr.contains("5");
    }
}
