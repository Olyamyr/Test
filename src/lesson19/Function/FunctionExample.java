package lesson19.Function;

import lesson17.Coin;

public class FunctionExample {
    public static void main(String[] args) {
        //Мы отправляем монеты транспортной компанией и заказчику предоставляем только нужну информацию о монете
        Coin coin = new Coin(5, 1999, 2.5, "Gold");
        //Переводим в объект монеты без лишней информации
        ShortCoin shortCoin = new ShortCoin(coin.getNominal(), coin.getMetalName());
        System.out.println(shortCoin);

        //Теперь делаем то же самое, только с использованием coin маппера
        CoinMapper coinMapper = new CoinMapper();
        ShortCoin shortCoin2 = coinMapper.apply(coin);
        System.out.println(shortCoin2);

//        System.out.println(new CoinMapper().apply(coin));
    }
}