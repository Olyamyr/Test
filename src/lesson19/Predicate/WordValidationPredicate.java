package lesson19.Predicate;

import java.util.function.Predicate;

public class WordValidationPredicate implements Predicate<String> {

    @Override
    public boolean test(String word) {
        //Проверили, что слово не пустое (если пустое, оно не соответствует - false)
        if (word == null || word.length() == 0) {
            return false;
        }

        //Делаем слово капслоком
        String upperCaseWord = word.toUpperCase();

        //Проверили, что в слове есть буква т или Т (если нет, оно не соответствует - false)
        if (!upperCaseWord.contains("Т")) {
            return false;
        }

        //Проверили, что в слове есть буква е или Е (если нет, оно не соответствует - false)
        if (!upperCaseWord.contains("Е")) {
            return false;
        }

        //Возвращаем true, если в слове нету буквы к или К, иначе false
        return !upperCaseWord.contains("К");
    }
}
