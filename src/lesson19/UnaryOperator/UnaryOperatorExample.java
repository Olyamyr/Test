package lesson19.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        //Предположим, что у нас есть сайт, где при регистрации пользователя приветствуют по имени которое он указал
        //... предположим, что мы реализуем программу с этапа, на котором данные от пользователя мы уже получили
        String name = "Сергей";
        String helloText = "Добро пожаловать, ";
        System.out.println(helloText + name);

        //Сделаем то же самое с использованием Unary Operator
        HelloOperator helloOperator = new HelloOperator();
        System.out.println(helloOperator.apply(name));
    }
}
