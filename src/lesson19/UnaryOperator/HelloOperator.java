package lesson19.UnaryOperator;

import java.util.function.UnaryOperator;

public class HelloOperator implements UnaryOperator<String> {
    @Override
    public String apply(String name) {
        return "Добро пожаловать, " + name;
    }
}

