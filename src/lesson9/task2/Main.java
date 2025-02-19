package lesson9.task2;

public class Main {
    public static void main(String[] args) {
        Snake snake1 = new Snake(40, 80.0, 200);
        Snake snake2 = new Snake(30, 100.0, 350);
        Monkey monkey = new Monkey(8, 15.0, "коричневый");
        Fish fish = new Fish(8, 0.5, 5, "серебристый");

        System.out.println("Демонстрация метода monkey:\n");
        monkey.climbTree();

        //Создали разных животных и сложили в массив животных
        Animal[] animals = {snake1, snake2, monkey, fish};

        System.out.println("\nВызов методов move() для всех животных:\n");
        for (Animal animal : animals) {
            animal.move();

            if (animal instanceof Snake) {
                ((Snake) animal).hiss();
            } else if (animal instanceof Monkey) {
                ((Monkey) animal).climbTree();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
            System.out.println();
        }
    }
}