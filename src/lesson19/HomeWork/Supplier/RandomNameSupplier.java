package lesson19.HomeWork.Supplier;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Supplier;

public class RandomNameSupplier implements Supplier<String> {
    private List<String> names;

    public RandomNameSupplier(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RandomNameSupplier that = (RandomNameSupplier) o;
        return Objects.equals(names, that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(names);
    }

    @Override
    public String toString() {
        return "RandomNameSupplier{" +
                "names=" + names + '}';
    }

    @Override
    public String get() {
        Random random = new Random();
        return names.get(random.nextInt(names.size()));
    }
}