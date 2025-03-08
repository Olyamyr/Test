package lesson18;

import java.util.*;

public class Fridge {
    private final Map<String, Integer> products = new HashMap<>();

    /**
     * Положить продукт в холодильник
     * @param product название продукта
     * @param weight вес продукта
     */
    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    /**
     * Взять продукт из холодильника
     * @param product название продукта
     * @param weight вес продукта
     */
    public void takeProduct(String product, int weight) {
        int currentWeight = products.getOrDefault(product, 0);

        if (currentWeight >= weight) {
            int remainingWeight = currentWeight - weight;

            if (remainingWeight > 0) {
                products.put(product, remainingWeight);
            } else {
                products.remove(product);
            }
        }
    }

    /**
     * Вывести вес всех продуктов в холодильнике(сумма)
     */
    public int printTotalWeight() {
        return products.values().stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Вывести вес конкретного продукта в холодильнике
     * @param product название продукта
     */
    public int printProductWeight(String product) {
        return products.getOrDefault(product, 0);
    }

    /**
     * Вывести наименование продукта, который закончится первым
     */
    public String printFirstExpiredItem() {
        return Collections.min(
                products.entrySet(),
                Comparator.comparingInt(Map.Entry::getValue)
        ).getKey();
    }

    /**
     * Вывести наименование продукта, которого больше всего
     */
    public String printMostAbundantProduct() {
        if (products.isEmpty()) {
            return null;
        }

        Set<Map.Entry<String, Integer>> entries = new HashSet<>(products.entrySet());
        Map.Entry<String, Integer> maxEntry = Collections.max(entries, Map.Entry.comparingByValue());

        return maxEntry.getKey();
    }

    /**
     * Вывести все продукты (название + вес) по алфавиту от Я до А
     */
    public void printAllProductsFromZToA() {
        //По умолчанию отсортированы от А до Я, поэтому устанавливаем компаратор reverseOrder(), который развернет порядок наоборот
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());

        for (String productName : productNames) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }

    /**
     * Вывести все продукты (название + вес) по весу от большего к меньшему
     */
    public void printAllProductsByWeightDescending() {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(products.entrySet());

        entries.sort(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
