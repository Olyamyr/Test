package lesson18;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        //Положить продукт в холодильник
        fridge.addProduct("Банан", 200);
        fridge.addProduct("Масло", 500);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 150);
        fridge.addProduct("Колбаса", 1000);

        //Взять продукт из холодильника
        fridge.takeProduct("Масло", 50);
        System.out.println("\nПосле взятия 50 грамм масла:");
        fridge.printAllProductsFromZToA();

        System.out.println("\nВес всех продуктов в холодильнике: " + fridge.printTotalWeight() + " грамм");
        System.out.println("\nВес банана: " + fridge.printProductWeight("Банан") + " грамм");
        //Вывести вес конкретного продукта в холодильнике
        System.out.println("\nНаименование продукта, который закончится первым: " + fridge.printFirstExpiredItems());
        System.out.println("\nНаименование продукта, которого больше всего: " + fridge.printMostAbundantProduct());

        System.out.println("\nВсе продукты (название + вес) по алфавиту от Я до А");
        fridge.printAllProductsFromZToA();

        System.out.println("\nВсе продукты (название + вес) по весу от большего к меньшему");
        fridge.printAllProductsByWeightDescending();
    }
}
